package com.matri.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class HomeController {

	@RequestMapping(value= {"/Home", "/"} , method=RequestMethod.GET)
	public String getHome(ModelMap map, Authentication authentication){
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if(user == null){
			map.put("page", "Home");
			return "page-home";
		}else if(authentication.getAuthorities().iterator().next().getAuthority().equals("Admin")){
			return "redirect:/Admin/Home";
		}else{
			return "redirect:/User/Home";
		}
	}
	
	@RequestMapping(value="/About" , method=RequestMethod.GET)
	public String getAbout(ModelMap map){
		map.put("page", "About");
		return "page-about";
	}
	
	@GetMapping("/Login")
	public String getLogin(ModelMap map){
		map.put("page", "Login");
		return "page-login";
	}
}
