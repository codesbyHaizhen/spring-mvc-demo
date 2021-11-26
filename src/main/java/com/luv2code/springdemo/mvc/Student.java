package com.luv2code.springdemo.mvc;

import java.util.HashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private HashMap<String,String> countryOptions;
	private String favoriteLanguage;
	
	

	public Student() {
		countryOptions = new HashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("GR","Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("FR", "France");
	}
	
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
	
	public HashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	
	
	
}
