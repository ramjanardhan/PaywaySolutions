package com.paywaysolutions.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.paywaysolutions.model.RegistrationModel;
import com.paywaysolutions.model.SignInModel;
import com.paywaysolutions.util.DataSourceDataProvider;

@Controller
public class FormController {

@Autowired
FormControlService formService;
@Bean
public JdbcTemplate jdbcTemplate(DataSource dataSource) {
    return new JdbcTemplate(dataSource);
}


	 @RequestMapping(path= "/registration",method=RequestMethod.POST)    

	    public ModelAndView register(@ModelAttribute("customer")RegistrationModel rModel){


	       System.out.println("Name is "+rModel.getFirstName()+"."+rModel.getLastName());
	       System.out.println("password is "+rModel.getPassword());
	       System.out.println("email is "+rModel.getEmail());
	       System.out.println("mobile number is "+rModel.getMobile());
	       System.out.println("alternate mobile number is "+rModel.getMobile1());
	       formService.addPerson(rModel);
	       
	        return new ModelAndView("greet","message","Registered Successfully!!");

	    }
	

	 @RequestMapping(path= "/signin",method=RequestMethod.POST)    

	    public ModelAndView signIn(@ModelAttribute("customer")SignInModel signIn){
		 System.out.println("email is "+signIn.getUserName());

	       formService.retrieveUser(signIn);
	       
	        return new ModelAndView("greet","message","Signed in Successfully!!");

	    }
	
}
