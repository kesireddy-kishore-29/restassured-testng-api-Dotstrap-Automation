package com.qaautomation.framework.listeners;

import com.qaautomation.framework.annotations.Feature;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestNGMethod;

/**
 * Refuses to start a suite containing a test without a valid {@link Feature} ID. Traceability is a
 * build rule, not a convention: an untraceable test never runs.
 */
public final class TraceabilityListener implements ISuiteListener {

  static final Pattern FEATURE_ID = Pattern.compile("FEAT-[A-Z0-9]+-\\d{2}");

  @Override
  public void onStart(ISuite suite) {
    List<String> problems = new ArrayList<>();
    for (ITestNGMethod testMethod : suite.getAllMethods()) {
      Method method = testMethod.getConstructorOrMethod().getMethod();
      String name = method.getDeclaringClass().getSimpleName() + "#" + method.getName();
      Feature feature = method.getAnnotation(Feature.class);
      if (feature == null || feature.value().length == 0) {
        problems.add(name + " has no @Feature");
        continue;
      }
      for (String id : feature.value()) {
        if (!FEATURE_ID.matcher(id).matches()) {
          problems.add(name + " has a malformed feature ID '" + id + "'");
        }
      }
    }
    if (!problems.isEmpty()) {
      throw new IllegalStateException(
          "Traceability check failed; every test needs @Feature(\"FEAT-<AREA>-<NN>\"):\n  - "
              + String.join("\n  - ", problems));
    }
  }
}
