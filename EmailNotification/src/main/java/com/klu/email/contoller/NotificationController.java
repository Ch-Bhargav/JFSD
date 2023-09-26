package com.klu.email.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klu.email.model.NotificationManagement;

@RestController
@RequestMapping("/email")
public class NotificationController {
	@Autowired
	NotificationManagement M;
	@GetMapping("/send")
	public String send() {
		return M.sendEmail("dummyhacker99@gmail.com", "chiramdasubhargav16@gmail.com", "Testing", "Message Bro!");
	}
	
	
	
}
