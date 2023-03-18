package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld-process";
	}
	
	
	@RequestMapping("/process")
	public String letsShoutDude(HttpServletRequest req,Model model) {
		
		String name=req.getParameter("studentName");
		
		model.addAttribute("message","yo!"+name.toUpperCase());
		
		
		return "helloworld-process";
		
		
		
		
		
	}
	
//	
//	@RequestMapping("/processFormVersion2")
//	public String letsShoutDude1( @RequestParam{"studentName"} String theName,Model model) {
//		
//		theName="yo!"+theName.toUpperCase()+"I did thid";
//		
//		model.addAttribute("message",theName);
//		
//		
//		return "helloworld-process";
//		
//		
//		
//		
//		
//	}
			
	
	
	
	
}
