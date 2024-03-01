package com.andres.curso.springboot.jpa.springbootjpa;

import com.andres.curso.springboot.jpa.springbootjpa.entities.Person;
import com.andres.curso.springboot.jpa.springbootjpa.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringbootJpaApplication implements CommandLineRunner {
	@Autowired
	private final PersonRepository repository;

    public SpringbootJpaApplication(PersonRepository repository) {
        this.repository = repository;
    }

    public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaApplication.class, args);
	}

	@Override
	public void run(String... args) {
		//List<Person> persons = (List<Person>) repository.findAll();

		List<Person> persons = repository.findByProgrammingLanguage("Ruby", "Isabel");

		persons.forEach(System.out::println);

			}
}
