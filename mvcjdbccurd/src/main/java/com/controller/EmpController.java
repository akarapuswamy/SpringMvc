 package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dao.EmployeeDaoImp;
import com.pojo.Employee;

@Controller
public class EmpController {
	
	@Autowired
	private EmployeeDaoImp employeeDaoImp;
	
	
	@GetMapping("/login")
	public String login() {
		return "regiform";
		
	}

		@PostMapping("/insert")
	 public String save(Employee emp) {
		 employeeDaoImp.save(emp);
		return "redirect:allEmp";
		 
	 }
		@GetMapping("/allEmp")
		public ModelAndView getall() {
			List<Employee> list =employeeDaoImp.findAll();
			
			return new ModelAndView("insert","swa",list);	
		}
		
		
//		@GetMapping("/add")
//		public String add() {
//			return "save";
//			
	//	}
		
		@GetMapping("/delete")
		public String delete(@RequestParam int id) {
			return "delect";
			
		}
		@PostMapping("/del")
		public String deleted(@RequestParam int id) {
			employeeDaoImp.delete(id);
			return "redirect:allEmp";
			
		}
		
		
//		@GetMapping("/update")
//		public ModelAndView update(@RequestParam Employee id) {
//			int getbyeid =employeeDaoImp.update(id);
//					return new ModelAndView("update","frind",getbyeid);
//			
//		}
			
		
		

	
	
	

}
