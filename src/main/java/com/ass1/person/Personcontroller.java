package com.ass1.person;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class Personcontroller {

	@Autowired
	private PersonService personservice;

	@PostMapping("/persons")
	public Persondetails Saveperson(@Valid @RequestBody Persondetails persondetails) {
		return personservice.Saveperson(persondetails);
	}

	@GetMapping("/persons")
	public List<Persondetails> fetchpersondetailList() {
		return personservice.fetchpersondetailsList();
	}

	@GetMapping("/persons/{ID}")
	public Optional<Persondetails> fetchbyID(@PathVariable("ID") Long ID) throws PersonNotFoundException {
		return personservice.fetchbyID(ID);
	}

	@DeleteMapping("/persons/{ID}")
	public String deletepersondetailsbyID(@PathVariable("ID") Long ID) {
		personservice.deletepersondetailsbyID(ID);
		return "depertment deleted successfully";
	}

	@PutMapping("/persons/{ID}")
	public Persondetails updatepersondetails(@PathVariable("ID") Long ID, @RequestBody Persondetails persondetails) {
		return personservice.updatepersondetails(ID, persondetails);
	}
}
