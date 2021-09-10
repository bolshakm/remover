package com.custom.phone.remover.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestAppController {

	@GetMapping("/action/{param}")
	public ResponseEntity action(@PathVariable String param){
		System.out.println(param);
		return ResponseEntity.ok().build();
	}
}
