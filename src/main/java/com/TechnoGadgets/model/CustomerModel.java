package com.TechnoGadgets.model;


public class CustomerModel {
	private int customer_id;
	private String firstName;
	private String lastName;
	private String email;
	private int phone;
	private String dob;
	private String password;
	private String confirmpassword;
	private String imageUrl;
	private String Address;
	private String Gender;
	
	public CustomerModel() {
		
	}
	public CustomerModel(String email, String password) {
		this.email = email;
		this.password= password;
	}
	public CustomerModel(int id,String firstName,String lastName,
			String Gender,String email, int phone, String dob, String password, 
			String confirmpassword, String imageUrl, String Address,String image_path) {
			super ();
			this.customer_id=id;
			this.firstName=firstName;
			this.lastName=lastName;
			this.phone=phone;
			this.dob=dob;
			this.password=password;
			this.confirmpassword = confirmpassword;
			this.Address=Address;
			this.Gender=Gender;
			
		}
	
	public CustomerModel(int id, String firstName, String lastName
			,String email, int phone) {
		this.customer_id= id;
		this.firstName= firstName;
		this.lastName= lastName;
		this.email=email;
		this.phone=phone;
		
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getAddress() {
		return Address;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String Gender) {
		this.Gender=Gender;
	}
	public void setAddress(String address) {
		Address = address;
	}
}
