package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klu.entity.Samyak;
import com.klu.model.SamyakManager;

@RestController
@RequestMapping("/samyak")
public class SmayakController {

	@Autowired
	SamyakManager SM;
	
	@GetMapping("/events")
	public String events()
	{
		return SM.getEvents().toString();
	}
	
	@PostMapping("/register")
	public String register(@RequestBody Samyak S)
	{
		return SM.registration(S);
	}
}
