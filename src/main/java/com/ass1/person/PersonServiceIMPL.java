package com.ass1.person;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceIMPL implements PersonService {

	@Autowired
	private PersonRepositary personrepositary;

	@Override
	public Persondetails Saveperson(Persondetails persondetails) {
		return personrepositary.save(persondetails);
	}

	@Override
	public List<Persondetails> fetchpersondetailsList() {
		return personrepositary.findAll();
	}

	@Override
	public Optional<Persondetails> fetchbyID(Long iD) throws PersonNotFoundException {
		Optional<Persondetails> personDetails = personrepositary.findById(iD);

		if (!personDetails.isPresent()) {
			throw new PersonNotFoundException("persondetails are not available");
		}
		return Optional.of(personDetails.get());
	}

	@Override
	public void deletepersondetailsbyID(Long iD) {
		personrepositary.deleteById(iD);
	}

	@Override
	public Persondetails updatepersondetails(Long iD, Persondetails persondetails) {
		Persondetails pds = personrepositary.findById(iD).get();

		if (Objects.nonNull(persondetails.getName()) && !"".equalsIgnoreCase(persondetails.getName())) {
			pds.setName(persondetails.getName());
		}

		if (Objects.nonNull(persondetails.getAge())) {
			pds.setAge(persondetails.getAge());
		}

		return personrepositary.save(pds);
	}

}
