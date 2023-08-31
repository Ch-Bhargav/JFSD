package com.klu.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klu.spring.entity.Course;
import com.klu.spring.model.CourseManager;

@RestController
@RequestMapping("/course")
public class CourseController {

	@Autowired
	CourseManager M;
	
	@PostMapping("/save")
	public String save(@RequestBody Course C)
	{
		return M.saveData(C);
	}
	
	@PostMapping("/update/{id}")
	public String update(@RequestBody Course C) {
		return M.saveData(C);
	}
}