package de.bohnottensen.vaadin.controller;

import de.bohnottensen.vaadin.model.Person;
import de.bohnottensen.vaadin.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PersonService {

  private final PersonRepository personRepository;

  public final List<Person> findAllPersons() {
    return personRepository.findAll();
  }
}
