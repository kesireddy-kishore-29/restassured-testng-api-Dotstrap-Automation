package com.qaautomation.tools.quarantine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Adds the {@code quarantine} group to one test method's {@code @Test} annotation. Used only by the
 * quarantine proposal (a pull request a person reviews), never by the healing agent.
 */
public final class QuarantineProposer {

  private QuarantineProposer() {}

  public static String addQuarantineGroup(String source, String methodName) {
    Matcher method =
        Pattern.compile("public\\s+void\\s+" + Pattern.quote(methodName) + "\\(").matcher(source);
    if (!method.find()) {
      throw new IllegalArgumentException("No test method " + methodName);
    }
    int testAt = source.lastIndexOf("@Test", method.start());
    if (testAt < 0) {
      throw new IllegalArgumentException("No @Test above " + methodName);
    }
    String head = source.substring(0, testAt);
    String tail = source.substring(testAt);
    if (tail.startsWith("@Test(")) {
      int close = tail.indexOf(')');
      String attrs = tail.substring("@Test(".length(), close);
      if (attrs.contains("\"quarantine\"")) {
        return source;
      }
      Matcher groups = Pattern.compile("groups\\s*=\\s*\\{").matcher(attrs);
      String newAttrs =
          groups.find()
              ? attrs.substring(0, groups.end())
                  + "\"quarantine\", "
                  + attrs.substring(groups.end())
              : "groups = {\"quarantine\"}, " + attrs;
      return head + "@Test(" + newAttrs + tail.substring(close);
    }
    return head + "@Test(groups = {\"quarantine\"})" + tail.substring("@Test".length());
  }
}
