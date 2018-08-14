package com.paywaysolutions.persistance;

import com.paywaysolutions.model.RegistrationModel;
import com.paywaysolutions.model.SignInModel;

public interface DAOService {
public String registerUser(RegistrationModel register);
public String retrieveUser(SignInModel signIn);
}
