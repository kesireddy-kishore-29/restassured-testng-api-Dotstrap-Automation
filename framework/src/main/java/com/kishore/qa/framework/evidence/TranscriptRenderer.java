package com.kishore.qa.framework.evidence;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/** Renders a transcript three ways: plain text per call, a Markdown document, an HTML timeline. */
public final class TranscriptRenderer {

  private TranscriptRenderer() {}

  public static String exchangeAsText(Exchange e) {
    StringBuilder out = new StringBuilder();
    out.append('#').append(e.sequence()).append(' ').append(e.method()).append(' ').append(e.url());
    out.append("\n").append("correlation: ").append(e.correlationId());
    out.append("\n\n--- request headers ---\n");
    appendHeaders(out, e.requestHeaders());
    if (e.requestBody() != null) {
      out.append("\n--- request body ---\n").append(e.requestBody()).append('\n');
    }
    out.append("\n--- response: ")
        .append(e.status() == null ? "none" : e.status())
        .append(" in ")
        .append(e.durationMs())
        .append(" ms ---\n");
    if (e.error() != null) {
      out.append("error: ").append(e.error()).append('\n');
    }
    appendHeaders(out, e.responseHeaders());
    if (e.responseBody() != null && !e.responseBody().isEmpty()) {
      out.append('\n').append(e.responseBody()).append('\n');
    }
    if (!e.contractViolations().isEmpty()) {
      out.append("\n--- contract violations ---\n");
      e.contractViolations().forEach(v -> out.append("- ").append(v).append('\n'));
    }
    return out.toString();
  }

  public static String markdown(TestIdentity id, int attempt, String status, List<Exchange> calls) {
    StringBuilder md = new StringBuilder();
    md.append("# Transcript: ").append(id.title()).append("\n\n");
    md.append("| | |\n|---|---|\n");
    md.append("| Test | `").append(id.testId()).append("` |\n");
    md.append("| Features | ").append(String.join(", ", id.featureIds())).append(" |\n");
    md.append("| Attempt | ").append(attempt).append(" |\n");
    md.append("| Status | ").append(status).append(" |\n");
    md.append("| Calls | ").append(calls.size()).append(" |\n\n");
    md.append("Secrets (tokens, passwords, credential headers) are masked as `****`.\n\n");
    md.append("| # | Call | Status | ms | Correlation ID |\n|---|---|---|---|---|\n");
    for (Exchange e : calls) {
      md.append("| ")
          .append(e.sequence())
          .append(" | `")
          .append(e.method())
          .append(' ')
          .append(e.pathTemplate())
          .append("` | ")
          .append(e.status() == null ? "error" : e.status())
          .append(e.contractViolations().isEmpty() ? "" : " ⚠ contract")
          .append(" | ")
          .append(e.durationMs())
          .append(" | `")
          .append(e.correlationId())
          .append("` |\n");
    }
    for (Exchange e : calls) {
      md.append("\n## ").append(e.sequence()).append(". ").append(e.method()).append(' ');
      md.append(e.pathTemplate()).append("\n\n```text\n").append(exchangeAsText(e)).append("```\n");
    }
    return md.toString();
  }

  /**
   * A self-contained HTML page: one bar per call, positioned by start time and sized by duration.
   */
  public static String timeline(
      TestIdentity id, String status, Instant testStart, List<Exchange> calls) {
    long totalMs =
        Math.max(
            1,
            calls.stream()
                .mapToLong(
                    e -> Duration.between(testStart, e.startedAt()).toMillis() + e.durationMs())
                .max()
                .orElse(1));
    StringBuilder rows = new StringBuilder();
    for (Exchange e : calls) {
      long offset = Math.max(0, Duration.between(testStart, e.startedAt()).toMillis());
      double left = 100.0 * offset / totalMs;
      double width = Math.max(0.6, 100.0 * e.durationMs() / totalMs);
      String cls =
          e.status() == null || e.status() >= 500 ? "bad" : e.status() >= 400 ? "warn" : "ok";
      rows.append("<tr><td class=\"n\">")
          .append(e.sequence())
          .append("</td><td class=\"call\"><code>")
          .append(escape(e.method() + " " + e.pathTemplate()))
          .append("</code></td><td class=\"s ")
          .append(cls)
          .append("\">")
          .append(e.status() == null ? "error" : e.status())
          .append("</td><td class=\"ms\">")
          .append(e.durationMs())
          .append(" ms</td><td class=\"bar\"><span class=\"")
          .append(cls)
          .append("\" style=\"left:")
          .append(String.format(Locale.ROOT, "%.2f", left))
          .append("%;width:")
          .append(String.format(Locale.ROOT, "%.2f", width))
          .append("%\" title=\"+")
          .append(offset)
          .append(" ms\"></span></td></tr>\n");
    }
    return """
        <!doctype html>
        <html lang="en"><head><meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Timeline</title>
        <style>
        :root{--bg:#fff;--fg:#1d2433;--muted:#5b6475;--line:#e3e7ef;--ok:#1f8f5f;--warn:#b7791f;--bad:#c53030}
        @media (prefers-color-scheme:dark){:root{--bg:#121722;--fg:#e6e9f0;--muted:#9aa3b5;--line:#273044}}
        body{margin:0;padding:24px 16px;background:var(--bg);color:var(--fg);
          font:14px/1.5 system-ui,sans-serif}
        h1{font-size:18px;margin:0 0 4px} p{color:var(--muted);margin:0 0 16px}
        table{width:100%%;border-collapse:collapse}
        td{padding:6px 8px;border-bottom:1px solid var(--line);vertical-align:middle}
        .n,.ms{color:var(--muted);white-space:nowrap} .s{font-weight:600}
        .s.ok{color:var(--ok)} .s.warn{color:var(--warn)} .s.bad{color:var(--bad)}
        .bar{position:relative;width:45%%;min-width:160px}
        .bar span{position:absolute;top:8px;height:10px;border-radius:3px}
        .bar span.ok{background:var(--ok)} .bar span.warn{background:var(--warn)}
        .bar span.bad{background:var(--bad)}
        code{font-size:13px}
        </style></head><body>
        <h1>%s</h1>
        <p>%s · %s · %d call(s) over %d ms</p>
        <table>%s</table>
        </body></html>
        """
        .formatted(
            escape(id.title()), escape(id.testId()), escape(status), calls.size(), totalMs, rows);
  }

  private static void appendHeaders(StringBuilder out, Map<String, String> headers) {
    headers.forEach((k, v) -> out.append(k).append(": ").append(v).append('\n'));
  }

  static String escape(String text) {
    return text.replace("&", "&amp;")
        .replace("<", "&lt;")
        .replace(">", "&gt;")
        .replace("\"", "&quot;");
  }
}
