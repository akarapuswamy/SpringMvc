package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pojo.Employee;
import com.service.EmployeeServiceDaoImp;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeServiceDaoImp employeeServiceDaoImp;
	
	@GetMapping("/insert")
	public String add() {
		return "openpage";	
	}
	@PostMapping("/saved")
	public ModelAndView save(Employee e) {
//		public ModelAndView save(@Validated @ModelAttribute("e")Employee e,BindingResult results) {
//		if (results.hasErrors()) {
//			return new ModelAndView("saveerror");
//			
//		}
		employeeServiceDaoImp.save(e);
		ModelAndView model = new ModelAndView("redirect:list");
		return model;
	}
	
	@GetMapping("/list")
	public ModelAndView get() {
		List<Employee> e = employeeServiceDaoImp.GetAll();
		return  new ModelAndView("getall", "map" ,e);
		
	}
	
	@GetMapping("/remove")
	public String remove(@RequestParam Integer id) {
		employeeServiceDaoImp.delect(id);
		return "redirect:list";
	}
	
	@PostMapping("/update")
	public String update(Employee e) {
		int update = employeeServiceDaoImp.update(e);
		return "redirect:list";
		
	}
	@GetMapping("/find")
	public String findbyid(Integer id,Model m) {
		Employee findbyid = employeeServiceDaoImp.findbyid(id);
		m.addAttribute("e",findbyid);
			return "redirect:list";
		
	}
	
	
	
}