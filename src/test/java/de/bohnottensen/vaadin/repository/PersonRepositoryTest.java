package de.bohnottensen.vaadin.repository;

import de.bohnottensen.vaadin.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;

@DataJpaTest
class PersonRepositoryTest {

  @Autowired
  private PersonRepository personRepository;

  @Autowired
  private TestEntityManager entityManager;

  @Test
  void givenPerson_whenSaved_thenSuccess() {
    Person newPerson = new Person();
    newPerson.setFirstName("Michael");
    newPerson.setLastName("Bohn");

    Person savedPerson = personRepository.save(newPerson);

    assertThat(entityManager.find(Person.class, savedPerson.getId())).isEqualTo(newPerson);

  }

  @Test
  void testFindPersonByFirstNameAndLastNameAndBirthDate() {
    Person person = new Person();
    person.setLastName("Doe");
    person.setBirthDate(LocalDate.ofEpochDay(1L));
    person.setId(123L);
    person.setFirstName("Jane");
    person.setBirthPlace("Birth Place");

    Person person1 = new Person();
    person1.setLastName("Doe");
    person1.setBirthDate(LocalDate.ofEpochDay(1L));
    person1.setId(123L);
    person1.setFirstName("Jane");
    person1.setBirthPlace("Birth Place");
    personRepository.save(person);
    personRepository.save(person1);
    assertNull(
        personRepository.findPersonByFirstNameAndLastNameAndBirthDate("foo", "foo", LocalDate.ofEpochDay(1L)));
  }

}