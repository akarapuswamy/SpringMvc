package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.pojo.Person;
import com.queries.Queries;
@Repository
public class PersonDaoImp implements PersonDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
   
	public int save(Person per) {
		int i = jdbcTemplate.update(Queries.insert, new Object[] {per.getId(),per.getName(),per.getAddress()});
		System.out.println("inside Sussfully");
		return i;
	}
	
	public List<Person> allpersons() {
		List<Person> list = jdbcTemplate.query(Queries.getallperson, new RowMapper<Person>(){

			public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
				Person p1 = new Person();
				p1.setId(rs.getInt(1));
				p1.setName(rs.getString(2));
				p1.setAddress(rs.getString(3));
				return p1;
			}
			});
		return list;
	}

	public int delect(int id) {
		int delect = jdbcTemplate.update(Queries.delect, new Object [] {id});
		return delect;
	}

	public int update(Person person) {
		int i = jdbcTemplate.update(Queries.update, new Object[] {person.getName(),person.getAddress(),person.getId()});
		return i;
	}

	@SuppressWarnings("deprecation")
	public Person FindByeId(int id) {
		Person f = jdbcTemplate.queryForObject(Queries.findbyid, new Object[] {id},BeanPropertyRowMapper.newInstance(Person.class));
		return f;
	}	
}