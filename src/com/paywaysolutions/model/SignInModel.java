package com.paywaysolutions.model;

public class SignInModel {
private String userName;
private String password;
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public SignInModel(String userName, String password) {
	super();
	this.userName = userName;
	this.password = password;
}
public SignInModel() {
	super();
	// TODO Auto-generated constructor stub
}

}
