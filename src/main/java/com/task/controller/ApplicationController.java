package com.task.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.student.Student;

@RestController
@RequestMapping("/api")
public class ApplicationController {
	
	
	@PostMapping("/insert")
	public String studInsert(@RequestBody Student stud)
	{
		
		stud.setStudName("shashank");
		return "Student inserted Successfully";

	}
	
	@GetMapping("/fetch")
	public String studFetch(@PathVariable Student stud)
	{
		return stud.getStudName();
	}
	
	
	
	@PutMapping("/update")
	public String studUpdate(@RequestBody Student stud)
	{
		stud.setStudName("ketan");
		return "Student updated Successfully";
	}






}
