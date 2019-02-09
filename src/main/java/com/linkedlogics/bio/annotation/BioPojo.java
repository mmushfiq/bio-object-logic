package com.linkedlogics.bio.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface BioPojo {
	int code() default 0;
	String name() default "" ;
	int version() default 0 ;
	int dictionary() default 0 ;
}
