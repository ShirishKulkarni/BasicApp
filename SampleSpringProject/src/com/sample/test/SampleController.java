package com.sample.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sample.service.MyService;

@Controller
public class SampleController {

	@Autowired
	private MyService myService;
	
	
	@RequestMapping(value = "/home.action", method = RequestMethod.GET)
	public String reddirectToPage() {
		System.out.println("cntrller called");
		myService.getDetails();
		
		return "home";
	}
}
