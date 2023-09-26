package com.klu.email.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class NotificationManagement {

	@Autowired
	JavaMailSender mailSender;
	
	public String sendEmail(String senderEmail,String toEmail,String Subject, String message) {
		
		try {
			SimpleMailMessage mailMessage = new SimpleMailMessage();
			mailMessage.setFrom(senderEmail);
			mailMessage.setTo(toEmail);
			mailMessage.setSubject(Subject);
			mailMessage.setText(message);
			
			mailSender.send(mailMessage);
			return "Email Sent Successfully";
		}
		catch(Exception e) {
			return e.getMessage();
		}
	}
}
