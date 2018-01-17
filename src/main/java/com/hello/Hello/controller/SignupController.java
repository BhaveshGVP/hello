package com.hello.Hello.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hello.Hello.mail.MockMailSender;

@Controller
public class SignupController {

	/*
	 * @Autowired private MessageSource messageSource;
	 */
	private static Log log = LogFactory.getLog(MockMailSender.class);

	@GetMapping("/signup")
	public String signup() {

		return "signup";
	}

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String doSignup(@RequestParam String email, @RequestParam String name, @RequestParam String password) {

		log.info("email: " + email);
		log.info("name: " + name);
		log.info("password: " + password);
		return "redirect:/";
	}

}
