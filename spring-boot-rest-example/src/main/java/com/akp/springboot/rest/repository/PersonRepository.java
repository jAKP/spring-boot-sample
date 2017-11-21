package com.akp.springboot.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akp.springboot.rest.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}