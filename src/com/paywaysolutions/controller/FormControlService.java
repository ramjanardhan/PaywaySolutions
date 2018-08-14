package com.paywaysolutions.controller;

import com.paywaysolutions.model.RegistrationModel;
import com.paywaysolutions.model.SignInModel;

public interface FormControlService {
public void addPerson(RegistrationModel registrationModel);
public String retrieveUser(SignInModel singIn);
}
