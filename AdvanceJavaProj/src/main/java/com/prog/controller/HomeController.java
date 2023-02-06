package com.prog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.prog.pojo.Bank;
import com.prog.service.BankService;

@Controller
public class HomeController {
	@Autowired
    private BankService service;
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
    
	 @PostMapping("/register")
	   public String registration(@ModelAttribute Bank b) {
	    	service.addDetails(b);

		return "dashboard";
}
	 @GetMapping("/delete/{Id}")
	 public String remove(@PathVariable Integer Id) {
		 service.delete(Id);
		return "redirect:/faltu";
		 
	 }
	 @GetMapping("/faltu")
	 public String newPage(Model m) {
		 List<Bank> bank=service.getAllDetails();
	    	m.addAttribute("b1",bank);
		return "FaltuPage";
		 
	 }
	 @GetMapping("/edit/{Id}")
	 public String edit(@PathVariable Integer Id,Model m) { 
		Bank b = service.update(Id);
		m.addAttribute("bankUp",b);
		return "Edit";
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
}