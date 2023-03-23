package com.dao;

import java.util.List;

import com.pojo.Employee;

public interface EmployeeDao {
	int save(Employee e);
	int update(Employee e);
	int delect(Integer id);
	List<Employee>GetAll();
	Employee findbyid(Integer id);

}
