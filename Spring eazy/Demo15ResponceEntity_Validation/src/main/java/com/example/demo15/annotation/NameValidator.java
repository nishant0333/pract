package com.example.demo15.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.example.demo15.validation.ValidName;

@Documented
@Constraint(validatedBy = ValidName.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface NameValidator {
	 String message() default "Please choose Different name from nishant ,Nishant";
	    Class<?>[] groups() default {};
	    Class<? extends Payload>[] payload() default {};
}
