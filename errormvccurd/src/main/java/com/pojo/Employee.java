package com.pojo;

public class Employee {
	
	private Integer id;
	private String name;
	private String dese;
	private Double salary;
	
	public Employee() {
		super();
	}

	public Employee(Integer id, String name, String dese, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dese = dese;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDese() {
		return dese;
	}

	public void setDese(String dese) {
		this.dese = dese;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dese=" + dese + ", salary=" + salary + "]";
	}
	

}
