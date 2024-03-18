package com.ass1.person;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class PersonAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long addressId;

	private String city;
	private String addressType;

	@OneToOne(mappedBy = "personAddress")
	private Persondetails persond;

	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public Persondetails getPersond() {
		return persond;
	}

	public void setPersond(Persondetails persond) {
		this.persond = persond;
	}

}
