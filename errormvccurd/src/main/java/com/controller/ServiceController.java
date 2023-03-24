package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.Employee;
import com.service.EmployeeServiceDaoImp;
@Controller
public class ServiceController {
	@Autowired
	private EmployeeServiceDaoImp employeeServiceDaoImp;
	
    @ResponseBody
	@GetMapping("/hello")
	public String hello() {

		return "hello my world";
	}
    
    @ResponseBody
   	@GetMapping("/allemp")
      public List<Employee> getallemployee(){
	return employeeServiceDaoImp.GetAll() ; 
	
 }
    
    @ResponseBody
   	@GetMapping("/emp/{id}")
    public Employee getbyemps(@PathVariable Integer id) {
		return employeeServiceDaoImp.findbyid(id);
    	
    }
    @ResponseBody
    @PostMapping("/add")
    public int insert(@RequestBody Employee employee) {
		return employeeServiceDaoImp.save(employee);
    	
    }
    @ResponseBody
    @GetMapping("/rem/{id}")
    public int delect(@PathVariable Integer id) {
		return employeeServiceDaoImp.delect(id);
    }
    
    @ResponseBody
    @PostMapping("/update/{id}")
    public int update(@RequestBody Employee emp) {
		return employeeServiceDaoImp.update(emp);
    	
    }
    
}
