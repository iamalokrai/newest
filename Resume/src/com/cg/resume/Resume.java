package com.cg.resume;

public class Resume {
	String firstName;
	String lastName;
	String gender;
	String highestQualification;
	String dateOfBirth;
	String hobbies[] ;
	String address;
	String skills[];
	String email;
	String website;
	String contactNo;
	public Resume(String firstName, String lastName, String gender, String highestQualification, String dateOfBirth,
			String[] hobbies, String address, String[] skills, String email, String website, String contactNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.highestQualification = highestQualification;
		this.dateOfBirth = dateOfBirth;
		this.hobbies = hobbies;
		this.address = address;
		this.skills = skills;
		this.email = email;
		this.website = website;
		this.contactNo = contactNo;
	}
	

}
