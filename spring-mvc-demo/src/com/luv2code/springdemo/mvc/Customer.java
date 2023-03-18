package com.luv2code.springdemo.mvc;

import javax.validation.constraints.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.luv2code.springdemo.mvc.validation.CourseCode;

public class Customer {

	
	private String firstName;
	
	
	
	

	@CourseCode(value="Foobar",message="must start with Foobar")
	private String courseCode;
	
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}",message="Only 5 Digits")
	private String postalCode;
	
	
	
	
	
	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@NotNull(message="is required")
	@Min(value=0,message="must be greater than or equal")
	@Max(value=10,message="must be lesser than or equal")
	private Integer freePasses;
	
	
	
	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freepasses) {
		this.freePasses = freepasses;
	}

	@Size(min=1,message="is required")
	@NotNull(message="is wanted")
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
	
}
