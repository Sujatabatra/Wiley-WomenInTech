package com.sujata.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.coyote.http11.Http11AprProtocol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.model.User;
import com.sujata.model.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public ModelAndView welcomePageController() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("login");
		return mv;
	}
	
	/*
	 * Web Container in application server creates HttpServletRequest Object and store HttpRequest data in it
	 */
	@RequestMapping(path="/login",method = RequestMethod.POST)
	public ModelAndView loginCheckController(HttpServletRequest request) {
		ModelAndView mv=new ModelAndView();
		String uname=request.getParameter("username");
		String password=request.getParameter("pwd");
		User user=new User(uname, password);
		String message=null;
		String greet=null;
		if(userService.loginCheck(user)) {
			greet="Welcome";
			message="Login Successful!";
		}
		else {
			greet="Sorry";
			message="Login Failed";
		}
		
		mv.setViewName("result");
		mv.addObject("message", message);
		mv.addObject("user", uname);
		mv.addObject("greet", greet);
		return mv;
	}

}
