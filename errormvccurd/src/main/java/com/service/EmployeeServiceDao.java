package com.service;

import java.util.List;

import com.pojo.Employee;

public interface EmployeeServiceDao {
	int save(Employee e);
	int update(Employee e);
	List<Employee>GetAll();
	Employee findbyid(Integer id);
	int delect(Integer id);

}
