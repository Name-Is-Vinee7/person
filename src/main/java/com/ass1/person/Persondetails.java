package com.ass1.person;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;

@Entity

public class Persondetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long ID;

	@NotBlank(message = "please add person name")
	private String name;
	private int age;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_number")
	private PersonAddress personAddress;

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
