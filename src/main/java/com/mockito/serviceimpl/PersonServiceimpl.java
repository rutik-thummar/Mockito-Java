package com.mockito.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mockito.model.Person;
import com.mockito.repository.PersonRepository;
import com.mockito.service.PersonService;

@Service
public class PersonServiceimpl implements PersonService {
	@Autowired
	PersonRepository personRepository;

	@Override
	public List<Person> getAll() {
		return personRepository.findAll();
	}

	@Override
	public Person addPerson(Person person) {
		return personRepository.save(person);
	}

	@Override
	public Person getPerson(Long id) {
		return personRepository.getById(id);
	}

	@Override
	public Boolean deletePerson(Long id) {
		personRepository.deleteById(id);
		return true;
	}

}
