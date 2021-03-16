package com.sujata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyFirstController {

	@RequestMapping("/")
	public ModelAndView myFirstController() {
		return new ModelAndView("first.jsp", "message", "Welcome to Spring Boot web MVC");
	}
}
