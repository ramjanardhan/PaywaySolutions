package com.paywaysolutions.util;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import com.paywaysolutions.model.EmailPojo;



@Component
public class SendMail {
	@Autowired
	private JavaMailSenderImpl javaMailSender;

	public boolean sendMail(EmailPojo emailPojo) {
		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		try {
			MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

			helper.setFrom("skorada94@gmail.com");
			helper.setTo("skorada94@gmail.com"); // need to add the owner email ID
			helper.setSubject("Re : Loan Type :" + emailPojo.getLoanType());
			String customerData = "Customer Name :: " + emailPojo.getCustomerName() + "\n" + "Customer Mobile No :: "
					+ emailPojo.getCustomerMobileNo() + "\n" + "Customer Email Id  :: " + emailPojo.getCustomerMailID()
					+ "\n" + "Customer Loan Type :: " + emailPojo.getLoanType() + "\n" + "Customer Address :: "
					+ emailPojo.getCustomerAddress();
			System.out.println("Custome Data :: " + customerData);
			helper.setText(customerData);
			/*
			 * uncomment the following lines for attachment FileSystemResource file = new
			 * FileSystemResource("attachment.jpg");
			 * helper.addAttachment(file.getFilename(), file);
			 */

			javaMailSender.send(mimeMessage);
			System.out.println("Mail sent successfully.");
			return true;
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception occured :: "+e.getMessage());
			return false;
		}

	}
}
