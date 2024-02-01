package com.adityan150.demo.controllers;

//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adityan150.demo.mail.MailSender;

@RestController
public class MailController {

	private MailSender mailSender;

	// to use Qualifier
	// public MailController(@Qualifier("smtp") MailSender smtp)

	public MailController(MailSender smtpMailSender) {
		this.mailSender = smtpMailSender;
	}

	@RequestMapping("/mail")
	public String mail() {
		mailSender.send("mail@example.com", "Test mail", "Body of the test mail...");
		return "Mail sent!";
	}
}
