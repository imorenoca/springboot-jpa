package com.andres.curso.springboot.jpa.springbootjpa.repositories;

import com.andres.curso.springboot.jpa.springbootjpa.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface PersonRepository extends JpaRepository<Person, Long> {
    @Query("select p from Person p where p.programmingLanguage = ?1 and p.name = ?2")
    List<Person> findByProgrammingLanguage(String programmingLanguage, String name);
}

