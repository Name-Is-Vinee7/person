package com.ass1.person;

import java.util.List;
import java.util.Optional;

public interface PersonService {

	public Persondetails Saveperson(Persondetails persondetails);

	public List<Persondetails> fetchpersondetailsList();

	public Optional<Persondetails> fetchbyID(Long iD) throws PersonNotFoundException;

	public void deletepersondetailsbyID(Long iD);

	public Persondetails updatepersondetails(Long iD, Persondetails persondetails);

}
