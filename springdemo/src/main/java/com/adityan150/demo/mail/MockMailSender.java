package com.adityan150.demo.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

//@Component

public class MockMailSender implements MailSender {
	private static Log log = LogFactory.getLog(MockMailSender.class);

	@Override
	public void send(String to, String subject, String body) {
		log.info("Sending mock mail to: " + to);
		log.info("with subject: " + subject);
		log.info("and body: " + body);
	}
}
