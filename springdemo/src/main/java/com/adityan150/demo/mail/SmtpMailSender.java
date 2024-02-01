package com.adityan150.demo.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

// default name and qualifier for a bean is
// its class name in camel-case. For eg. smtpMailSender
// Name and qualifier can be changed: 

//@Component("smtp")

//@Component
//@Qualifier("smtp")

public class SmtpMailSender implements MailSender {
	private static Log log = LogFactory.getLog(SmtpMailSender.class);

	@Override
	public void send(String to, String subject, String body) {
		log.info("Sending SMTP mail to: " + to);
		log.info("with subject: " + subject);
		log.info("and body: " + body);
	}
}
