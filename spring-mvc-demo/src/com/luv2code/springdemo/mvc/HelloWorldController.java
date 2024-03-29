package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	//need a controller method to show the inital HTML form
	@RequestMapping("/showForm")
	public String showForm()  
	{
		return "helloworld-form";
	}
	
	//need a controller method to process the html form
	
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloworld";
	}
	
	/*
	 * //new a controller method to reead from data and data to the model
	 * 
	 * @RequestMapping("/processFormVersionTwo") public String
	 * letsShoutDude(HttpServletRequest request, Model model) { //read the request
	 * parameter from the HTML form String theName =
	 * request.getParameter("studentName");
	 * 
	 * //convert the data to all caps theName = theName.toUpperCase();
	 * 
	 * //create the message String result = "Yo!!! "+theName;
	 * 
	 * //add message to the model model.addAttribute("message", result);
	 * 
	 * return "helloworld"; }
	 */
	
		//new a controller method to reead from data and data to the model
		@RequestMapping("/processFormVersionThree")
		public String letsShoutDude(@RequestParam("studentName") String theName,  Model model)
		{
			//convert the data to all caps
			theName = theName.toUpperCase();
			
			//create the message
			String result = "Hello My Friend!!! "+theName;
			
			//add message to the model
			model.addAttribute("message", result);
			
			return "helloworld";
		}
}
