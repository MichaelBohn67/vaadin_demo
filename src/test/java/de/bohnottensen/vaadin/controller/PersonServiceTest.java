package de.bohnottensen.vaadin.controller;

import de.bohnottensen.vaadin.model.Person;
import de.bohnottensen.vaadin.repository.PersonRepository;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

@ContextConfiguration(classes = {PersonService.class})
@ExtendWith(SpringExtension.class)
class PersonServiceTest {

  private final Person personMock = mock(Person.class);
  private final PersonRepository repositoryMock = mock(PersonRepository.class);
  private final PersonService service = new PersonService(repositoryMock);
  @MockBean
  private PersonRepository personRepository;
  @Autowired
  private PersonService personService;

  @Test
  void givenFindAllReturnPerson() {
    when(repositoryMock.findAll()).thenReturn(Collections.singletonList(personMock));

    List<Person> result = service.findAllPersons();

    assertThat(result, Matchers.contains(personMock));
  }

  @Test
  public void testFindAllPersons() {
    ArrayList<Person> personList = new ArrayList<>();
    when(personRepository.findAll()).thenReturn(personList);
    List<Person> actualFindAllPersonsResult = personService.findAllPersons();
    assertSame(personList, actualFindAllPersonsResult);
    assertTrue(actualFindAllPersonsResult.isEmpty());
    verify(personRepository).findAll();
  }

  @Test
  public void testFindAllPersons2() {
    ArrayList<Person> personList = new ArrayList<>();
    when(personRepository.findAll()).thenReturn(personList);
    List<Person> actualFindAllPersonsResult = personService.findAllPersons();
    assertSame(personList, actualFindAllPersonsResult);
    assertTrue(actualFindAllPersonsResult.isEmpty());
    verify(personRepository).findAll();
  }

}