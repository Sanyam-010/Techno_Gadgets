package com.TechnoGadgets.model;


/**
 * CustomerModel represents customer attributes.
 */
public class CustomerModel {
	private int id;
	private String firstName;
	private String lastname;
	private String username;
	private String dob;
	private String gender;
	private String email;
	private String phone;
	private String password;
	private String profilepicture;

	public CustomerModel() {
	}

	public CustomerModel(String username, String pasword) {
		this.username = username;
		this.password = pasword;
	}

	public CustomerModel(int id, String firstName, String lastname, String username, String dob, String gender,
			String email, String phone, String role, String password, String profilepicture) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastname = lastname;
		this.username = username;
		this.dob = dob;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.profilepicture = profilepicture;
	}

	public CustomerModel(int id, String firstName, String lastName, String email, String phone) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastname = lastName;
		this.email = email;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProfilepicture() {
		return profilepicture;
	}

	public void setProfilepicture(String profilepicture) {
		this.profilepicture = profilepicture;
	}

}
