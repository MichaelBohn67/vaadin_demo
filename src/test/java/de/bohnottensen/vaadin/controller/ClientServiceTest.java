package de.bohnottensen.vaadin.controller;

import de.bohnottensen.vaadin.model.Address;
import de.bohnottensen.vaadin.model.Client;
import de.bohnottensen.vaadin.model.Person;
import de.bohnottensen.vaadin.repository.ClientRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

@ContextConfiguration(classes = {ClientService.class})
@ExtendWith(SpringExtension.class)
class ClientServiceTest {

  private final ClientRepository repositoryMock = mock(ClientRepository.class);
  private final Client clientMock = mock(Client.class);
  private final Person personMock = mock(Person.class);
  private final Address addressMock = mock(Address.class);
  private final ClientService service = new ClientService(repositoryMock);
  @MockBean
  private ClientRepository clientRepository;
  @Autowired
  private ClientService clientService;

  @Test
  void givenPersonReturnClient() {
    when(repositoryMock.findClientByPerson(personMock)).thenReturn(clientMock);

    Client result = service.findClientByPerson(personMock);

    assertThat(result, is(clientMock));
  }

  @Test
  public void testFindClientByPerson() {
    Person person = new Person();
    person.setLastName("Doe");
    person.setBirthDate(LocalDate.ofEpochDay(1L));
    person.setId(123L);
    person.setFirstName("Jane");
    person.setBirthPlace("Birth Place");

    Address address = new Address();
    address.setNumber("Number");
    address.setCountry("Country");
    address.setId(123L);
    address.setCity("Oxford");
    address.setCountryIso2("Country Iso2");
    address.setPostCode("OX1 1PT");
    address.setStreet("Street");

    Client client = new Client();
    client.setId(123L);
    client.setPerson(person);
    client.setAddress(address);
    when(clientRepository.findClientByPerson(any())).thenReturn(client);

    Person person1 = new Person();
    person1.setLastName("Doe");
    person1.setBirthDate(LocalDate.ofEpochDay(1L));
    person1.setId(123L);
    person1.setFirstName("Jane");
    person1.setBirthPlace("Birth Place");
    assertSame(client, clientService.findClientByPerson(person1));
    verify(clientRepository).findClientByPerson(any());
  }

  @Test
  public void testFindClientByPerson2() {
    Person person = new Person();
    person.setLastName("Doe");
    person.setBirthDate(LocalDate.ofEpochDay(1L));
    person.setId(123L);
    person.setFirstName("Jane");
    person.setBirthPlace("Birth Place");

    Address address = new Address();
    address.setNumber("Number");
    address.setCountry("Country");
    address.setId(123L);
    address.setCity("Oxford");
    address.setCountryIso2("Country Iso2");
    address.setPostCode("OX1 1PT");
    address.setStreet("Street");

    Client client = new Client();
    client.setId(123L);
    client.setPerson(person);
    client.setAddress(address);
    when(clientRepository.findClientByPerson(any())).thenReturn(client);

    Person person1 = new Person();
    person1.setLastName("Doe");
    person1.setBirthDate(LocalDate.ofEpochDay(1L));
    person1.setId(123L);
    person1.setFirstName("Jane");
    person1.setBirthPlace("Birth Place");
    assertSame(client, clientService.findClientByPerson(person1));
    verify(clientRepository).findClientByPerson(any());
  }

  @Test
  public void testFindClientByPerson3() {
    Person person = new Person();
    person.setLastName("Doe");
    person.setBirthDate(LocalDate.ofEpochDay(1L));
    person.setId(123L);
    person.setFirstName("Jane");
    person.setBirthPlace("Birth Place");

    Address address = new Address();
    address.setNumber("Number");
    address.setCountry("Country");
    address.setId(123L);
    address.setCity("Oxford");
    address.setCountryIso2("Country Iso2");
    address.setPostCode("OX1 1PT");
    address.setStreet("Street");

    Client client = new Client();
    client.setId(123L);
    client.setPerson(person);
    client.setAddress(address);
    when(clientRepository.findClientByPerson(any())).thenReturn(client);

    Person person1 = new Person();
    person1.setLastName("Doe");
    person1.setBirthDate(LocalDate.ofEpochDay(1L));
    person1.setId(123L);
    person1.setFirstName("Jane");
    person1.setBirthPlace("Birth Place");
    assertSame(client, clientService.findClientByPerson(person1));
    verify(clientRepository).findClientByPerson(any());
  }

  @Test
  public void testFindClientByPersonFirstNameAndPersonLastName() {
    Person person = new Person();
    person.setLastName("Doe");
    person.setBirthDate(LocalDate.ofEpochDay(1L));
    person.setId(123L);
    person.setFirstName("Jane");
    person.setBirthPlace("Birth Place");

    Address address = new Address();
    address.setNumber("Number");
    address.setCountry("Country");
    address.setId(123L);
    address.setCity("Oxford");
    address.setCountryIso2("Country Iso2");
    address.setPostCode("OX1 1PT");
    address.setStreet("Street");

    Client client = new Client();
    client.setId(123L);
    client.setPerson(person);
    client.setAddress(address);
    when(clientRepository.findClientByPerson_FirstNameAndPerson_LastName(anyString(), anyString()))
        .thenReturn(client);
    assertSame(client, clientService.findClientByPersonFirstNameAndPersonLastName("Jane", "Doe"));
    verify(clientRepository).findClientByPerson_FirstNameAndPerson_LastName(anyString(), anyString());
  }

  @Test
  public void testFindClientByPersonFirstNameAndPersonLastName2() {
    Person person = new Person();
    person.setLastName("Doe");
    person.setBirthDate(LocalDate.ofEpochDay(1L));
    person.setId(123L);
    person.setFirstName("Jane");
    person.setBirthPlace("Birth Place");

    Address address = new Address();
    address.setNumber("Number");
    address.setCountry("Country");
    address.setId(123L);
    address.setCity("Oxford");
    address.setCountryIso2("Country Iso2");
    address.setPostCode("OX1 1PT");
    address.setStreet("Street");

    Client client = new Client();
    client.setId(123L);
    client.setPerson(person);
    client.setAddress(address);
    when(clientRepository.findClientByPerson_FirstNameAndPerson_LastName(anyString(), anyString()))
        .thenReturn(client);
    assertSame(client, clientService.findClientByPersonFirstNameAndPersonLastName("Jane", "Doe"));
    verify(clientRepository).findClientByPerson_FirstNameAndPerson_LastName(anyString(), anyString());
  }

  @Test
  public void testFindClientsByAddressCountry() {
    ArrayList<Client> clientList = new ArrayList<>();
    when(clientRepository.findClientsByAddress_Country(anyString())).thenReturn(clientList);
    List<Client> actualFindClientsByAddressCountryResult = clientService.findClientsByAddressCountry("Country");
    assertSame(clientList, actualFindClientsByAddressCountryResult);
    assertTrue(actualFindClientsByAddressCountryResult.isEmpty());
    verify(clientRepository).findClientsByAddress_Country(anyString());
  }

  @Test
  public void testFindClientsByAddressCountry2() {
    ArrayList<Client> clientList = new ArrayList<>();
    when(clientRepository.findClientsByAddress_Country(anyString())).thenReturn(clientList);
    List<Client> actualFindClientsByAddressCountryResult = clientService.findClientsByAddressCountry("Country");
    assertSame(clientList, actualFindClientsByAddressCountryResult);
    assertTrue(actualFindClientsByAddressCountryResult.isEmpty());
    verify(clientRepository).findClientsByAddress_Country(anyString());
  }

  @Test
  public void testFindClientsByAddressCountryIso2() {
    ArrayList<Client> clientList = new ArrayList<>();
    when(clientRepository.findClientsByAddress_CountryIso2(anyString())).thenReturn(clientList);
    List<Client> actualFindClientsByAddressCountryIso2Result = clientService
        .findClientsByAddressCountryIso2("Iso2");
    assertSame(clientList, actualFindClientsByAddressCountryIso2Result);
    assertTrue(actualFindClientsByAddressCountryIso2Result.isEmpty());
    verify(clientRepository).findClientsByAddress_CountryIso2(anyString());
  }

  @Test
  public void testFindClientsByAddressCountryIso22() {
    ArrayList<Client> clientList = new ArrayList<>();
    when(clientRepository.findClientsByAddress_CountryIso2(anyString())).thenReturn(clientList);
    List<Client> actualFindClientsByAddressCountryIso2Result = clientService
        .findClientsByAddressCountryIso2("Iso2");
    assertSame(clientList, actualFindClientsByAddressCountryIso2Result);
    assertTrue(actualFindClientsByAddressCountryIso2Result.isEmpty());
    verify(clientRepository).findClientsByAddress_CountryIso2(anyString());
  }

  @Test
  void giverPersonFirstNameAndLastnameReturnClient() {
    when(repositoryMock.findClientByPerson_FirstNameAndPerson_LastName(personMock.getFirstName(), personMock.getLastName())).thenReturn(clientMock);

    Client result = service.findClientByPersonFirstNameAndPersonLastName(personMock.getFirstName(), personMock.getLastName());

    assertThat(result, is(clientMock));
  }

  @Test
  void givenCountryReturnClients() {
    when(repositoryMock.findClientsByAddress_Country(addressMock.getCountry())).thenReturn(Collections.singletonList(clientMock));

    List<Client> result = service.findClientsByAddressCountry(addressMock.getCountry());

    assertThat(result, contains(clientMock));
  }

  @Test
  void givenCountryIso2ReturnClients() {
    when(repositoryMock.findClientsByAddress_CountryIso2(addressMock.getCountryIso2())).thenReturn(Collections.singletonList(clientMock));

    List<Client> result = service.findClientsByAddressCountryIso2(addressMock.getCountryIso2());

    assertThat(result, contains(clientMock));
  }
}