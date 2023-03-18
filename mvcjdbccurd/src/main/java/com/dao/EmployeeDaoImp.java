package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.pojo.Employee;
@Repository
public class EmployeeDaoImp implements EmployeeDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int save(Employee employee) {
		
		String insert = "insert into Employee  values(?,?,?,?,?)";
		int i = jdbcTemplate.update(insert, new Object[] {employee.getId(),employee.getName(),employee.getLastName(),employee.getAddress(),employee.getSalary()});
		System.out.println("Employee save.....");
		return i;
		
		
	}

	public int update(Employee employee) {
		System.out.println(" Employee update...");
		String in ="update Employee set name=?,lastname=?,salary=?,address=?,where id=?)";
		int x = jdbcTemplate.update(in,new Object[] {employee.getName(),employee.getLastName(),employee.getSalary(),employee.getAddress(),employee.getId()});
		return x;
		
	}

	public int delete(int id) {
		System.out.println("delected ");
		String delect="delete from Employee where id=?";
		  Object[]d= {id};
		  int d1 = jdbcTemplate.update(delect, d);
	        System.out.println(d1);
			return d1;
	        
		
	}
	

	public Employee findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAll() {
		
		
		List<Employee> list = jdbcTemplate.query("select * from employee", new RowMapper<Employee>() {
			
			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

				Employee e=new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setLastName(rs.getString(3));
				e.setAddress(rs.getString(4));
				e.setSalary(rs.getDouble(5));
				
				return e;
			}
		});
		
		return list;
	}

	

}
