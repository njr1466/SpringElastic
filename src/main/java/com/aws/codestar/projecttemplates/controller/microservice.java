package com.aws.codestar.projecttemplates.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class microservice {
	
	@RequestMapping("/produto")
	public String produto() {
		return "tudo certo AWS?";
	}

}
