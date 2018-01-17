package com.hello.Hello.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter{

	

	@Override
	public void addViewControllers(ViewControllerRegistry reg) {
		// TODO Auto-generated method stub
		reg.addViewController("/").setViewName("home");
		reg.addViewController("/signup").setViewName("signup");
		
	}

}
