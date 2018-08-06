package com.paywaysolutions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paywaysolutions.model.RegistrationModel;
import com.paywaysolutions.persistance.RegistrationService;
import com.paywaysolutions.util.DataSourceDataProvider;

@Service
public class FormControllImpl implements FormControlService{
	@Autowired
	RegistrationService register;
	@Autowired
	DataSourceDataProvider dsdp;
	@Override
	public void addPerson(RegistrationModel registrationModel) {
		
		register.registerUser(dsdp.modelToEntity(registrationModel));
	}

}
