package com.hello.Hello.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hello.Hello.dto.LeaveType;
import com.hello.Hello.mail.MockMailSender;
import com.hello.Hello.repo.LeaveTypeRepository;

@Controller
public class SignupController {

	/*
	 * @Autowired private MessageSource messageSource;
	 */
	private static Log log = LogFactory.getLog(MockMailSender.class);

	
	@Autowired
	private LeaveTypeRepository leaveTypeRepository;
	
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

	@GetMapping("/leaveType")
	@ResponseBody
	public List<LeaveType> getLeaveType() {
		List<LeaveType> leaveTypeList = leaveTypeRepository.findAll();
		return leaveTypeList;
	}
	
	 
	 /*@RequestMapping(value = "/leaveType", method=RequestMethod.GET)
	 @ResponseBody
	 public  String getLeaveType() {
		
			 List<LeaveType> allleaveType = leaveTypeRepository.findAll();
			 Gson gson = new GsonBuilder().create();
			 String json = gson.toJson(allleaveType);
			 System.out.println("Dffffffffffffffff "+gson);
			return "ok";
		
	 }*/

}
