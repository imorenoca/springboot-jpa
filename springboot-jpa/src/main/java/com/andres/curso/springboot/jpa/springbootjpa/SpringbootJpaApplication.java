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
	private PersonRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Person> persons = (List<Person>) repository.findAll();

		persons.stream().forEach(person -> {
			System.out.println(person);
		});

			}
}
