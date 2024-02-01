package com.adityan150.demo.mail;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/*
 * Let's say we have imported a library in our application.
 * The source code does not have @Component annotation.
 * To create beans of classes in such a case, we can create
 * configuration class as follows.
 */

@Configuration
public class MailConfig {

	@Bean
	@Profile("dev")
	public MailSender mockMailSender() {
		return new MockMailSender();
	}

	@Bean
	@Profile("!dev")
	public MailSender smtpMailSender() {
		return new SmtpMailSender();
	}

}
