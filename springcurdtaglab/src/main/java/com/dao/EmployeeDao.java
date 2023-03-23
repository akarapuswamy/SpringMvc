package com.dao;

import java.util.List;

import com.pojo.Employee;

public interface EmployeeDao {
	int save(Employee emp);
	int delect(int id);
	int update (Employee employee);
	Employee FindByeId(int id);
	List<Employee> GetAllEmp();

}
