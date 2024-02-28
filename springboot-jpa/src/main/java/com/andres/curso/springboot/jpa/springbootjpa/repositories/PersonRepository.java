package com.andres.curso.springboot.jpa.springbootjpa.repositories;

import com.andres.curso.springboot.jpa.springbootjpa.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findByProgrammingLanguage(String programmingLanguage);
}
