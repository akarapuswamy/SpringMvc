package com.pojo;

public class Person {

	private Integer id;
	private String Name;
	private String Address;
	
	public Person() {
		super();
	}
	
	public Person(int id, String name, String address) {
		super();
		this.id = id;
		Name = name;
		Address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", Name=" + Name + ", Address=" + Address + "]";
	}



}
