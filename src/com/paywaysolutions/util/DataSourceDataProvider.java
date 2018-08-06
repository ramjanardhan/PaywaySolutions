package com.paywaysolutions.util;

import org.springframework.stereotype.Component;

import com.paywaysolutions.entity.ResgisterUsers;
import com.paywaysolutions.model.RegistrationModel;

@Component
public class DataSourceDataProvider {

	public ResgisterUsers modelToEntity(RegistrationModel registrationModel){
		ResgisterUsers rusers=new ResgisterUsers();
		rusers.setFirstName(registrationModel.getFirstName());
		rusers.setLastName(registrationModel.getLastName());
		rusers.setEmail(registrationModel.getEmail());
		rusers.setMobile(registrationModel.getMobile());
		rusers.setMobile1(registrationModel.getMobile1());
		rusers.setPassword(encyptPassword(registrationModel.getPassword()));
		
		return null;
		
	}
	public String encyptPassword(String password){
		
		return password;
	}
}
