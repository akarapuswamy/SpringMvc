package com.dao;

import java.util.List;


import com.pojo.Person;

public interface PersonDao {
	
	int save(Person per);
	int delect(int id);
	int update (Person person);
	Person FindByeId(int id);
	List<Person> allpersons();
}
