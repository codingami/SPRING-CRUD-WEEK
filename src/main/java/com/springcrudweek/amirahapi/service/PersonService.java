package com.springcrudweek.amirahapi.service;

import java.util.List;

import com.springcrudweek.amirahapi.model.Person;

public interface PersonService {
    Person createPerson(Person person);

    Person updatePerson(Person person);

    List <Person> getAllPeople();

    Person getPersonById(long personId);

    void deletePerson(long id);
}
