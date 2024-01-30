package com.adityan150.demo.mail;

public interface MailSender {

	void send(String to, String subject, String body);

}
