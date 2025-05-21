package com.TechnoGadgets.model;

import java.time.LocalDate;

public class CustomerModel {
    private String first_name;
	private String last_name;
    private String username;
    private int phone_number;
    private String gender;
    private String email;
    private String password;
    private LocalDate dob;
    private String image_path;
    private String role;
    public CustomerModel(String first_name, String last_name, String username, int phone_number, String gender,
			String email, String password, LocalDate dob, String image_path, String role) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.username = username;
		this.phone_number = phone_number;
		this.gender = gender;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.image_path = image_path;
		this.role = role;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getImage_path() {
		return image_path;
	}
	public void setImage_path(String image_path) {
		this.image_path = image_path;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
    
    
}