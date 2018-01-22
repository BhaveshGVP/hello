package com.hello.Hello.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	/*@Autowired
	private MessageSource messageSource;
	*/
	@RequestMapping("/hello")
	public String hello(Model model) {
	
		model.addAttribute("name","bhavesh");
		return "hello";
	}
	@RequestMapping("/contact")
	public String contact(Model model) {
		return "contact";
	
	}
	/*@RequestMapping("/hello")
	public ModelAndView hello( ) {
		ModelAndView model= new ModelAndView("hello");
		model.addObject("name","Bhavesh!");
		return model;
	}*/
	
	@RequestMapping("/hello/{id}")
	public String helloId(Model model,@PathVariable int id,Optional< String> name) {
	
		model.addAttribute("id",id);
		model.addAttribute("name",name.orElse("No Name"));
		
		return "hello-id";
	}
}
	