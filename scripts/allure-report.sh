#!/usr/bin/env bash
# Builds the Allure report with trend history.
#   scripts/allure-report.sh [previous-report-dir]
# Allure 2 keeps its trends in <report>/history. Copying that folder into the new results before
# generating carries the trend forward; CI passes the report it last published to gh-pages.
set -euo pipefail
cd "$(dirname "$0")/.."
results=tests/target/allure-results
previous="${1:-}"
if [ ! -d "$results" ]; then
  echo "allure-report: no results at $results (run a suite first)" >&2
  exit 1
fi
# Allure categories mirror the triage rules (a preview; qa-tools triage is authoritative).
cp config/allure/categories.json "$results/categories.json"
if [ -n "$previous" ] && [ -d "$previous/history" ]; then
  rm -rf "$results/history"
  cp -r "$previous/history" "$results/history"
  echo "allure-report: carried history from $previous"
else
  echo "allure-report: no previous history; this report starts a new trend"
fi
# allure-maven 3 also caches and merges history of its own, which counts earlier runs twice;
# it is switched off so the history passed in above is the only source.
rm -rf tests/target/site/allure-maven-plugin tests/target/allure-maven
./mvnw -B -q -pl tests -Dallure.history.enabled=false allure:report
echo "allure-report: tests/target/site/allure-maven-plugin/index.html"
