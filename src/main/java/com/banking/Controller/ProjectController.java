package com.banking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.banking.beans.Customer;
import com.banking.service.ProjectService;

@Controller
public class ProjectController {
	
	@Autowired
	private ProjectService service;
	
	@RequestMapping(method = RequestMethod.GET,path="/home")
	public String username() {
		System.out.println(10/0);
		return "home";
	}
	
	
//	@PostMapping("/req/{empid}")
//	public String userName(@RequestParam("name") String userName) {
//		System.out.println(userName);
//		return "home";
//	}
	
	@PostMapping("/req1/{empid}")
	public String userFrom(@PathVariable("empid")int empid, @RequestParam ("username")String userName) {
		System.out.println(userName+" "+empid);
		return "home";
	}
	@GetMapping("/page1")
	public String page1() {
		return "page1";
	}
	
//	@PostMapping("/page2")
//	public String page2(@RequestParam ("username") String userName, @RequestParam("age") int age, Model model) { 
//		model.addAttribute("username",userName);
//		model.addAttribute("age",age);
//		return "page2";
//	}
	
	@PostMapping("/page2")
	public ModelAndView page2(@RequestParam("username") String username, @RequestParam("age") int age) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("username", username);
		modelAndView.addObject("age", age);
		
		modelAndView.setViewName("page2");
		return modelAndView;
	}
	
	@GetMapping("/getcustomer/{account_number}")
	public String getCustomer(@PathVariable("account_number") long accountNumber,Model model) {
		Customer customer = service.getCustomer(accountNumber);
		model.addAttribute("customer", customer);
		return "view1";
	}
	
}
