package com.paywaysolutions.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="register_users")
public class ResgisterUsers {
	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 @Column(name = "id")
	 private Integer id;
	
	@Column(name="firstname")
	 private String firstName;
	 
	 @Column(name="lastname")
	 private String lastName;
	 
	 @Column(name="email")
	 private String email;
	 
	 @Column(name="password")
	 private String password;
	 
	 @Column(name="mobile")
	 private Long mobile;
	 
	 @Column(name="mobile1")
	 private Long mobile1;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
	 
	 
	 
}
