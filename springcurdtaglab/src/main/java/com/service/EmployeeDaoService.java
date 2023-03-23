package com.service;

import java.util.List;

import com.pojo.Employee;

public interface EmployeeDaoService {
	int save(Employee emp);
	int delect(int id);
	int update (Employee employee);
	Employee FindByeId(Integer id);
	List<Employee> GetAllEmp();
}
