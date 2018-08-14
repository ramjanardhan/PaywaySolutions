package com.paywaysolutions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paywaysolutions.model.RegistrationModel;
import com.paywaysolutions.model.SignInModel;
import com.paywaysolutions.persistance.DAOService;
import com.paywaysolutions.util.DataSourceDataProvider;

@Service
public class FormControllImpl implements FormControlService{
	@Autowired
	DAOService register;
	@Autowired
	DataSourceDataProvider dsdp;
	@Override
	public void addPerson(RegistrationModel registrationModel) {
		
		register.registerUser(registrationModel);
	}
	@Override
	public String retrieveUser(SignInModel singIn) {
		return	register.retrieveUser(singIn);
		 
	}

}
