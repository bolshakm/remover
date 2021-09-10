package com.custom.phone.remover.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AppController {

	@GetMapping("/index")
	public String getMainPage(){
		return "index";
	}

	@PostMapping("/action")
	public String action(@RequestParam String param, Model model){
		model.addAttribute("status", true);
		System.out.println(param);
		return "result";
	}

	@GetMapping("/die")
	public void die(){
		System.exit(1);
	}
}
