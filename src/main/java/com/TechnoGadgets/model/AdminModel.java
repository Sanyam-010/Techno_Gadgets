package com.TechnoGadgets.model;

import java.time.LocalDate;

public class AdminModel {

	private String AdminFirstName;
	private String AdminLastName;
	private int PhoneNumber;
	private String Password;
	private String Gender;
	private LocalDate DateOfBirth;
	private String Email;

	public AdminModel(int adminId, String adminFirstName, String adminLastName, int phoneNumber, String password,
			String gender, LocalDate dateOfBirth, String email) {
		super();
		AdminId = adminId;
		AdminFirstName = adminFirstName;
		AdminLastName = adminLastName;
		PhoneNumber = phoneNumber;
		Password = password;
		Gender = gender;
		DateOfBirth = dateOfBirth;
		Email = email;
	}

	public AdminModel(String adminFirstName, String adminLastName, int phoneNumber, String password, String gender,
			LocalDate dateOfBirth, String email) {
		AdminFirstName = adminFirstName;
		AdminLastName = adminLastName;
		PhoneNumber = phoneNumber;
		Password = password;
		Gender = gender;
		DateOfBirth = dateOfBirth;
		Email = email;
	}
	private int AdminId;
	public int getAdminId() {
		return AdminId;
	}

	public void setAdminId(int adminId) {
		AdminId = adminId;
	}

	public String getAdminFirstName() {
		return AdminFirstName;
	}

	public void setAdminFirstName(String adminFirstName) {
		AdminFirstName = adminFirstName;
	}

	public String getAdminLastName() {
		return AdminLastName;
	}

	public void setAdminLastName(String adminLastName) {
		AdminLastName = adminLastName;
	}

	public int getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
}
