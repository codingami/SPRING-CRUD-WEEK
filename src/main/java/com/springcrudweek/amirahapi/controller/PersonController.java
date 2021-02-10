package com.springcrudweek.amirahapi.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springcrudweek.amirahapi.model.Person;
import com.springcrudweek.amirahapi.service.PersonService;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/people")
    public ResponseEntity <List<Person>> getAllPeople() {
        return ResponseEntity.ok().body(personService.getAllPeople());
    }

    @GetMapping("/people/{id}")
    public ResponseEntity <Person> getPersonById(@PathVariable long id) {
        return ResponseEntity.ok().body(personService.getPersonById(id));
    }

    @PostMapping("/people")
    public ResponseEntity <Person> createPerson(@RequestBody Person person) {
        return ResponseEntity.ok().body(this.personService.createPerson(person));
    }

    @PutMapping("/people/{id}")
    public ResponseEntity <Person> updatePerson(@PathVariable long id, @RequestBody Person person) {
        person.setId(id);
        return ResponseEntity.ok().body(this.personService.updatePerson(person));
    }

    @DeleteMapping("/people/{id}")
    public HttpStatus deletePerson(@PathVariable long id) {
        this.personService.deletePerson(id);
        return HttpStatus.OK;
    }
}
