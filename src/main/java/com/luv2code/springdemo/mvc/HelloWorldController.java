package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("hello")
public class HelloWorldController {
	
	// controller method to initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// a new controller method to read form data and add the data to the model 
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		// read the request parameter from the HTML form 
		String theName = request.getParameter("studentName");
		
		// convert data in upper case
		theName = theName.toUpperCase();
		
		// create the message
		String result = "Yo! " + theName;
		
		// add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	// a new controller method to read form data with RequestParam annotation
		@RequestMapping("/processFormVersionThree")
		public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
			
			// convert data in upper case
			theName = theName.toUpperCase();
			
			// create the message
			String result = "Hey, my Friend! " + theName;
			
			// add message to the model
			model.addAttribute("message", result);
			
			return "helloworld";
		}
}
