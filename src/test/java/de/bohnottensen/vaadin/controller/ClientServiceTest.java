package de.bohnottensen.vaadin.controller;

import de.bohnottensen.vaadin.model.Address;
import de.bohnottensen.vaadin.model.Client;
import de.bohnottensen.vaadin.model.Person;
import de.bohnottensen.vaadin.repository.ClientRepository;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ClientServiceTest {

  private final ClientRepository repositoryMock = mock(ClientRepository.class);
  private final Client clientMock = mock(Client.class);
  private final Person personMock = mock(Person.class);
  private final Address addressMock = mock(Address.class);
  private final ClientService service = new ClientService(repositoryMock);

  @Test
  void givenPersonReturnClient() {
    when(repositoryMock.findClientByPerson(personMock)).thenReturn(clientMock);

    Client result = service.findClientByPerson(personMock);

    assertThat(result, is(clientMock));
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