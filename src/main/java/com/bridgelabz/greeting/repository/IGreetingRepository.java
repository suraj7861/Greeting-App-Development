package com.bridgelabz.greeting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.greeting.model.Greeting;

@Repository
public interface IGreetingRepository extends JpaRepository<Greeting, Long> {

}
