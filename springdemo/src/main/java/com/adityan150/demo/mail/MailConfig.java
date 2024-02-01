package com.adityan150.demo.mail;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 * Let's say we have imported a library in our application.
 * The source code does not have @Component annotation.
 * To create beans of classes in such a case, we can create
 * configuration class as follows.
 */

@Configuration
public class MailConfig {

	@Bean
	@ConditionalOnProperty(name = "spring.mail.host", havingValue = "foo", matchIfMissing = true)
	public MailSender mockMailSender() {
		return new MockMailSender();
	}

	@Bean
	@ConditionalOnProperty("spring.mail.host")
	public MailSender smtpMailSender() {
		return new SmtpMailSender();
	}

}
