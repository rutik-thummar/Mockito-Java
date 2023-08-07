package com.mockito.service;

import java.util.List;

import com.mockito.model.Person;

public interface PersonService {
	List<Person> getAll();

	Person addPerson(Person person);

	Person getPerson(Long id);

	Boolean deletePerson(Long id);
}
