package com.mockito.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.mockito.model.Person;
import com.mockito.service.PersonService;
import com.mockito.serviceimpl.PersonServiceimpl;

public class PersonControllerTest {

	@InjectMocks
	private PersonController personController;

	@Mock
	private PersonServiceimpl personService;

	public void getProductTest() {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person());
	}

	@Test
	public void getProducts() {
		when(personService.getAll()).thenReturn((List<Person>) Stream
				.of(new Person((long) 1, "Surat", "rutik"), new Person((long) 2, "Surat1", "rutik1"))
				.collect(Collectors.toList()));
		assertEquals(2, personService.getAll().size());
	}
}
