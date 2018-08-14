package com.paywaysolutions.persistance;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


import com.paywaysolutions.model.RegistrationModel;
import com.paywaysolutions.model.SignInModel;

@Component
public class DAOServiceImpl implements DAOService {

	@Autowired 
	JdbcTemplate jdbcTemplateObject;

	@Override
	public String registerUser(RegistrationModel register) {
		String sql="insert into register_users (firstname, lastname, eamil, password, mobile, mobile1) values (?, ?,?,?,?,?)";
		
		jdbcTemplateObject.update(sql,register.getFirstName(),register.getLastName(),register.getEmail(),register.getPassword(),register.getMobile(),register.getMobile1());
		System.out.println("Success!!");
		return "Success";
	}

	@Override
	public String retrieveUser(SignInModel signIn) {
		// TODO Auto-generated method stub
	System.out.println("in retrieveUser of DAOServiceImpl");
		String sql="SELECT EMAIL FROM register_users WHERE EMAIL=?";
		String email = (String)jdbcTemplateObject.queryForObject(
				sql, new Object[] { signIn.getUserName()}, String.class);
		System.out.println("email is "+email);
		return null;
	}



}
