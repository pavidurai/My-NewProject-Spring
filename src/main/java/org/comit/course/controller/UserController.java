package org.comit.course.controller;

import org.comit.course.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	
	@GetMapping("/")
	public String index()  {
		System.out.println("show Index Page");
		return "index";
	}
		
	}
