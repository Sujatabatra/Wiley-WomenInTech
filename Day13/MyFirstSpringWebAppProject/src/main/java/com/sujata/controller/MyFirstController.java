package com.sujata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyFirstController {
	
	@RequestMapping("/")
	public ModelAndView firstController() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("message", "Welcome to Spring Web MVC Project!");
		mv.setViewName("myindex.jsp");
		return mv;
	}
	
	@RequestMapping("/first")
	public ModelAndView secondController() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("message", "Welcome once again to Spring Web MVC Project!");
		mv.setViewName("myindex.jsp");
		return mv;
	}
	
	@RequestMapping("/second")
	public ModelAndView thirdController() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("message", "Welcome once again to Spring Web MVC Project from third Controller!");
		mv.setViewName("myindex.jsp");
		return mv;
	}

}
