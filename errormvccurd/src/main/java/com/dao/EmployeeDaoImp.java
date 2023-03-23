package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.pojo.Employee;
import com.queries.Queries;
@Repository
public class EmployeeDaoImp implements EmployeeDao {
	@Autowired
     private JdbcTemplate jdbcTemplate;
     
	public int save(Employee e) {
	int i = jdbcTemplate.update(Queries.insert, new Object[] {e.getId(),e.getName(),e.getDese(),e.getSalary()});
	System.out.println("inserted.......!");
		return i;
	}

	public int update(Employee e) {
		int update = jdbcTemplate.update(Queries.update, new Object[] {e.getName(),e.getDese(),e.getSalary(),e.getSalary()});
		return update;
	}

	

	public List<Employee> GetAll() {
		List<Employee> list = jdbcTemplate.query(Queries.GetAll, new RowMapper<Employee>() {

			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee e1 = new Employee();
				e1.setId(rs.getInt(1));
				e1.setName(rs.getString(2));
				e1.setDese(rs.getString(3));
				e1.setSalary(rs.getDouble(4));
				return e1;
			}
			
		});
		return list;
	}

	public Employee findbyid(Integer id) {
		Employee e =jdbcTemplate.queryForObject(Queries.findbyid,new Object[] {id},BeanPropertyRowMapper.newInstance(Employee.class));
		return e;
	}

	public int delect(Integer id) {
		int delect = jdbcTemplate.update(Queries.delete, new Object[] {id});
			return delect;
		}

	
}
