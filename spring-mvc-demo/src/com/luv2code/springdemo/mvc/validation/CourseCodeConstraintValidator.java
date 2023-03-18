package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements  ConstraintValidator<CourseCode,String>{

	
	private String coursePrefix;
	
	
	
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		
		coursePrefix=theCourseCode.value();
		
	}

	@Override
	public boolean isValid(String courseCode, ConstraintValidatorContext theConstraintValidatorContext) {
	
		
		
		if(courseCode!=null) {
			return courseCode.startsWith(coursePrefix);
		}
		else
			
			return true;
		
		
	
		
		
		
	}

	
	
	
	
	
}
