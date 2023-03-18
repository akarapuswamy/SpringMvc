package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dao.StudentDaoImp;
import com.pojo.Student;

@Controller
public class Control {
	
	@Autowired
	private StudentDaoImp dao;
	
	
	
	@PostMapping("/insert")
	public String save(Student s) {
		
		dao.save(s);
		return "redirect:getall";
		
	}
	@GetMapping("/add")
	public String login() {
		
		return "RegFile";
		
	}
	
	@GetMapping("/getall")
	public ModelAndView getAll() {
	
		List<Student> list = dao.getAll();
		
		return new ModelAndView("login","map",list);
		
	}


}
