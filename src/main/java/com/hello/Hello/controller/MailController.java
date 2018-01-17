package com.hello.Hello.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hello.Hello.mail.MailSender;

@RestController
public class MailController {

	@Autowired
	private MailSender smtpMailSender;

	@RequestMapping("/mail")
	public String mail() throws MessagingException {
		smtpMailSender.send("bhaveshsarvaiya577@gmail.com", "testing", "This is tested mail");
		return "mail sent";
	}

}
