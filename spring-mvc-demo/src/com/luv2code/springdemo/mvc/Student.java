package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

/*
 * Development Steps: Step-By-Step
 * 1. Create Student class
 * 
 * 2. Create Student Controller class
 * 
 * 3. Create HTML form
 * 
 * 4. Create form processing code in controller class
 * 
 * 5. Create confirmation form
 * 
 * 6. Run the Application
 */

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	
	private LinkedHashMap<String, String> countryOptions;

	private String favoriteLanguage;

	private LinkedHashMap<String, String> favoriteLanguageOptions;
	
	private String[] operationSystems;
	
	public String[] getOperationSystems() {
		return operationSystems;
	}


	public void setOperationSystems(String[] operationSystems) {
		this.operationSystems = operationSystems;
	}


	public Student() {
		
		//populate country option: used ISO country code
		
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("CH", "China");
		countryOptions.put("FR", "France");
		countryOptions.put("GE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("JA", "Japan");
		countryOptions.put("US", "United State of America");
		
		favoriteLanguageOptions = new LinkedHashMap<String, String>();
		favoriteLanguageOptions.put("Java", "Java");
		favoriteLanguageOptions.put("C", "C");
		favoriteLanguageOptions.put("C#", "C#");
		favoriteLanguageOptions.put("PHP", "PHP");
		favoriteLanguageOptions.put("Python", "Python");
		favoriteLanguageOptions.put("Ruby", "Ruby");
		
	}

	
	public String getCountry() {
		return country;
	}

	
	
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}


	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}


	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}


	public void setCountry(String country) {
		this.country = country;
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


	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	
	
}
