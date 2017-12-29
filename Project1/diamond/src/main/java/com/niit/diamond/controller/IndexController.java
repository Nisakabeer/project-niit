package com.niit.diamond.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController
{
	@RequestMapping("/")
    String index(Model m)
	{
		m.addAttribute("msg", "Hai.......Nissa.....");
		return "index";
	}

}
