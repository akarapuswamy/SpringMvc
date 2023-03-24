package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.Employee;
import com.service.EmployeeServiceDaoImp;
@Controller
//@RequestMapping("/rest")
public class RestController {
	
	@Autowired
	private EmployeeServiceDaoImp employeeServiceDaoImp;
	
	
//	   @ResponseBody
//		@GetMapping("/hello")
//		public String hello() {
//
//			return "hello my world";
//		}
//	    
//	   @ResponseBody
//	   	@GetMapping("/allemp")
//	      public List<Employee> getallemployee(){
//		return employeeServiceDaoImp.GetAll() ; 
//		
//	 } 
//	    @ResponseBody
//	   	@GetMapping("/emp/{id}")
//	    public Employee getbyemps(@PathVariable Integer id) {
//			return employeeServiceDaoImp.findbyid(id);
//	    	
//	    }
//	    @ResponseBody
//	   	@GetMapping("/save")
//	  public int insert(@RequestBody Employee emp) {
//		return employeeServiceDaoImp.save(emp);
//		  
//	  }
//	

}
