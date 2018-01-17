package com.hello.Hello.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MockMailSender implements MailSender {

	private static Log log = LogFactory.getLog(MockMailSender.class);

	@Override
	public void send(String to, String subject, String body) {

		log.info("sending mock mail to " + to);
		log.info("Subject " + subject);
		log.info("message " + body);
	}
	
}
