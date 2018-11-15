package com.paywaysolutions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.paywaysolutions.model.EmailPojo;
import com.paywaysolutions.util.SendMail;



@RestController
@RequestMapping(value = "mail")
public class MailController {
	@Autowired
	SendMail sendMail;

	@RequestMapping(value = "sendMail", method = RequestMethod.POST)
	public String sendMail(@RequestBody EmailPojo emailPojo) {
		System.out.println(" Email Data :: " + emailPojo.toString());
		sendMail.sendMail(emailPojo);
		return "success";
	}
}
