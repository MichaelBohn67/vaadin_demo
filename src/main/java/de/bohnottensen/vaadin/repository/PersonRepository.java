package de.bohnottensen.vaadin.repository;

import de.bohnottensen.vaadin.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

  Person findPersonByFirstNameAndLastNameAndBirthDate(String firstName, String lastName, LocalDate birthDate);
}