package com.springcrudweek.amirahapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springcrudweek.amirahapi.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{
}
