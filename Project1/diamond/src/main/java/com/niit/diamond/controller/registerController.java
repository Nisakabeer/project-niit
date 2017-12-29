package com.niit.diamond.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class registerController 
{
	@RequestMapping("/")
    String register()
	{
		
		return "register";
	}

}
