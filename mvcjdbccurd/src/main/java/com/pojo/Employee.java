package com.pojo;

public class Employee {
	private int id;
	private String Name;
	private String lastName;
	private String Address;
	private double salary;
	
	
	public Employee() {
		super();
	}


	public Employee(int id, String name, String lastName, String address, double salary) {
		super();
		this.id = id;
		Name = name;
		this.lastName = lastName;
		Address = address;
		this.salary = salary;
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


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", lastName=" + lastName + ", Address=" + Address + ", salary="
				+ salary + "]";
	}
	
	
	

}
