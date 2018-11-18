package com.aws.codestar.projecttemplates.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class microservice {
	
	@RequestMapping(value = "/produto", method = RequestMethod.GET)
	  public String produto() {
	    return "Bem vindo AWS";
	  }

}
