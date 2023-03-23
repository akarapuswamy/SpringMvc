package com.pojo;

public class Employee {
	private Integer id;
	private String Name;
	private String Address;
	private Double salary;
	
	public Employee() {
		super();
	}

	public Employee(Integer id, String name, String address, Double salary) {
		super();
		this.id = id;
		Name = name;
		Address = address;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", Address=" + Address + ", salary=" + salary + "]";
	}
	

	
	
	

}
