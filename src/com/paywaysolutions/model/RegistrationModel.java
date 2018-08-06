package com.paywaysolutions.model;

public class RegistrationModel {
private String firstName;
private String lastName;
private String email;
private String password;
private Long mobile;
private Long mobile1;
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
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Long getMobile() {
	return mobile;
}
public void setMobile(Long mobile) {
	this.mobile = mobile;
}
public Long getMobile1() {
	return mobile1;
}
public void setMobile1(Long mobile1) {
	this.mobile1 = mobile1;
}
public RegistrationModel(String firstName, String lastName, String email, String password, Long mobile,
		Long mobile1) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.password = password;
	this.mobile = mobile;
	this.mobile1 = mobile1;
}
public RegistrationModel() {
	super();
	// TODO Auto-generated constructor stub
}


}
 