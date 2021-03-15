package com.sujata.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstRestController {

	@RequestMapping(path="/first", method = RequestMethod.GET,produces = "text/plain")
	public String firstRestMethod() {
		return "<h1>Welcome to the world of Rest API</h1>";
	}
	
	@RequestMapping(path="/second", method = RequestMethod.GET,produces = "text/html")
	public String secondRestMethod() {
		return "<h1>Welcome to the world of Rest API</h1>";
	}
	
}
