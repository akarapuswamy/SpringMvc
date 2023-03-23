package com.service;

import java.util.List;

import com.pojo.Person;

public interface PersonServiceDao {
	
	int save(Person per);
	int delect(int id);
	int update (Person person);
	Person FindByeId(int id);
	List<Person> allpersons();

}
