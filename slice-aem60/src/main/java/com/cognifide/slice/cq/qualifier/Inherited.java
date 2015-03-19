package com.cognifide.slice.cq.qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Indicates that a SliceResource's field represents an inherited property, that
 * can be obtained from one of parent resources
 */
@Retention(RUNTIME)
@Target(FIELD)
public @interface Inherited {
}
