package de.bohnottensen.vaadin.controller;

import de.bohnottensen.vaadin.model.Person;
import de.bohnottensen.vaadin.repository.PersonRepository;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class PersonServiceTest {

  private final Person personMock = mock(Person.class);
  private final PersonRepository repositoryMock = mock(PersonRepository.class);
  private final PersonService service = new PersonService(repositoryMock);

  @Test
  void givenFindAllReturnPerson() {
    when(repositoryMock.findAll()).thenReturn(Collections.singletonList(personMock));

    List<Person> result = service.findAllPersons();

    assertThat(result, Matchers.contains(personMock));
  }

}