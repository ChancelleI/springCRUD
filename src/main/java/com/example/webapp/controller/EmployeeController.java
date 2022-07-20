package com.example.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
	 @GetMapping("/")
	    public String home(Model model) {
		 Iterable<> listEmployee = service.getEmployees();
		    model.addAttribute("employees", listEmployee);
	        return "home";
	    }

}
