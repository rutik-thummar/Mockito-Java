package com.mockito.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mockito.model.Person;
import com.mockito.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	PersonService personService;

	@GetMapping("/getlist")
	public List<Person> getList() {
		return personService.getAll();
	}

	@PostMapping("/add")
	public Person addLeave(Person person) {
		return personService.addPerson(person);
	}

	@GetMapping("/get")
	public Person getPerson(Long id) {
		return personService.getPerson(id);
	}

	@DeleteMapping("/delete")
	public Boolean deletePerson(Long id) {
		return personService.deletePerson(id);
	}
}
