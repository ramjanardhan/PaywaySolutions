package com.paywaysolutions.util;

import org.springframework.stereotype.Component;

import com.paywaysolutions.entity.ResgisterUsers;
import com.paywaysolutions.model.RegistrationModel;

@Component
public class DataSourceDataProvider {

	
	public String encyptPassword(String password){
		
		return password;
	}
}
