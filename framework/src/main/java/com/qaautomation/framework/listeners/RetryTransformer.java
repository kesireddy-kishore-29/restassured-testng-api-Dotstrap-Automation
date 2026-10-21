package com.qaautomation.framework.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

/** Gives every test the {@link RetryAnalyzer} without annotating each one. */
public final class RetryTransformer implements IAnnotationTransformer {

  // TestNG declares this callback with raw Class and Constructor; the override must match it.
  @Override
  @SuppressWarnings("rawtypes")
  public void transform(
      ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
    annotation.setRetryAnalyzer(RetryAnalyzer.class);
  }
}
