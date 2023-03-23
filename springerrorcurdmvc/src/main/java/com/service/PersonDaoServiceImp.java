package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.PersonDaoImp;
import com.pojo.Person;
@Service
public class PersonDaoServiceImp implements PersonServiceDao {
	@Autowired
	private PersonDaoImp personDaoImp;

	public int save(Person per) {
	int save = personDaoImp.save(per);
		return save;
	}

	public int delect(int id) {
		int delect = personDaoImp.delect(id);
		return delect;
	}

	public int update(Person person) {
		int update = personDaoImp.update(person);
		return update;
	}

	public Person FindByeId(int id) {
		Person findByeId = personDaoImp.FindByeId(id);
		return findByeId;
	}

	public List<Person> allpersons() {
		List<Person> list = personDaoImp.allpersons();
		return list;
	}

}
