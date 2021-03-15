package com.sujata.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySecondRestController {

	@RequestMapping(method = RequestMethod.GET,path = "/first/{na}")
	public String greet(@PathVariable("na")String name) {
		return "Welcome "+name+" to the world of Rest API!";
	}
	
	@RequestMapping(method = RequestMethod.GET,path = "/first/{fna}/{lna}")
	public String greetOnceAgain(@PathVariable("fna")String fname,@PathVariable("lna")String lname) {
		return "Welcome "+fname+" "+lname+" to the world of Rest API!";
	}
	
}
