package com.niit.diamond.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController 
{

	@RequestMapping("/")
    String login()
	{
		
		return "login";
	}

}
