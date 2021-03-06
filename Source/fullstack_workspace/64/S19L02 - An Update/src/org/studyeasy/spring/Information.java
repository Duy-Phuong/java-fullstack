package org.studyeasy.spring;

import java.util.Arrays;

public class Information {
	private String firstName,lastName,gender,country,message, visitedCountry[];

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String[] getVisitedCountry() {
		return visitedCountry;
	}

	public void setVisitedCountry(String[] visitedCountry) {
		this.visitedCountry = visitedCountry;
	}

	@Override
	public String toString() {
		return "Information [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", country="
				+ country + ", message=" + message + ", visitedCountry=" + Arrays.toString(visitedCountry) + "]";
	}
	
}
