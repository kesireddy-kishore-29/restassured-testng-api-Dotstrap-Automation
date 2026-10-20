package com.kishore.qa.framework.annotations;

import io.qameta.allure.LabelAnnotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Requirement IDs a test verifies, for example {@code @Feature("FEAT-IDEMP-01")}. Mandatory on
 * every test method: the traceability listener aborts the run if one is missing. Each ID becomes an
 * Allure {@code feature} label (through {@link LabelAnnotation}) and a row in the coverage matrix.
 * The same IDs are used for the same scenarios in every repository of the family.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@LabelAnnotation(name = "feature")
public @interface Feature {

  /** One or more IDs matching {@code FEAT-<AREA>-<NN>}. */
  String[] value();
}
