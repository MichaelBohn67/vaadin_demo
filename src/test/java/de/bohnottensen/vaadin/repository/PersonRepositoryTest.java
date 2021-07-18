package de.bohnottensen.vaadin.repository;

import de.bohnottensen.vaadin.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class PersonRepositoryTest {

  @Autowired
  PersonRepository repository;

  @Autowired
  TestEntityManager entityManager;

  @Test
  void givenPerson_whenSaved_thenSuccess() {
    Person newPerson = new Person();
    newPerson.setFirstName("Michael");
    newPerson.setLastName("Bohn");

    Person savedPerson = repository.save(newPerson);

    assertThat(entityManager.find(Person.class, savedPerson.getId())).isEqualTo(newPerson);

  }

}