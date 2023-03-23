package com.pojo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.lang.NonNull;

public class Mobile {
	@NotNull
	@NotEmpty
	
	Integer id;
	String MobileName;
	String MobileBrand;
	@NotNull
	Double  prize;
	
	
	public Mobile() {
		super();
	}
	
	
	public Mobile(Integer id, String mobileName, String mobileBrand, Double prize) {
		super();
		this.id = id;
		MobileName = mobileName;
		MobileBrand = mobileBrand;
		this.prize = prize;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getMobileName() {
		return MobileName;
	}


	public void setMobileName(String mobileName) {
		MobileName = mobileName;
	}


	public String getMobileBrand() {
		return MobileBrand;
	}


	public void setMobileBrand(String mobileBrand) {
		MobileBrand = mobileBrand;
	}


	public Double getPrize() {
		return prize;
	}


	public void setPrize(Double prize) {
		this.prize = prize;
	}


	@Override
	public String toString() {
		return "Mobile [id=" + id + ", MobileName=" + MobileName + ", MobileBrand=" + MobileBrand + ", prize=" + prize
				+ "]";
	}
}
