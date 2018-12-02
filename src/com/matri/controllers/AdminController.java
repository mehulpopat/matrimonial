package com.matri.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Admin")
public class AdminController {

	@GetMapping("/Home")
	public String getUserHome(){
		return "page-admin-home";
	}
	
	@GetMapping("/ViewProfile")
	public String getViewProfile(){
		return "page-admin-view-profile";
	}
}
