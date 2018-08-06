package com.paywaysolutions.persistance;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.paywaysolutions.entity.ResgisterUsers;
import com.paywaysolutions.model.RegistrationModel;

@Component
public class RegistrationServiceImpl implements RegistrationService {

	 @Autowired
	 private SessionFactory sessionFactory;

	
	@Override
	public String registerUser(ResgisterUsers register) {
		sessionFactory.getCurrentSession().saveOrUpdate(register);
		System.out.println("Success!!");
		return null;
	}

}
