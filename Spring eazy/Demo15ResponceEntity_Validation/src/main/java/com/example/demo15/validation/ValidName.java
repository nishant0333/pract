package com.example.demo15.validation;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.example.demo15.annotation.NameValidator;

public class ValidName implements ConstraintValidator<NameValidator, String> {

	List<String> notValidName;

	@Override
	public void initialize(NameValidator nameValidator) {
		notValidName = Arrays.asList("Nishat", "nishant");
	}

	@Override
	public boolean isValid(String nameField, ConstraintValidatorContext cxt) {
		return nameField != null && (!notValidName.contains(nameField));
	}

}
