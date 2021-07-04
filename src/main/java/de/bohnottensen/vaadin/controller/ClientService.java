package de.bohnottensen.vaadin.controller;

import de.bohnottensen.vaadin.model.Client;
import de.bohnottensen.vaadin.model.Person;
import de.bohnottensen.vaadin.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

/**
 * The type Client service.
 */
@RequiredArgsConstructor
@Service
public class ClientService {

  private final ClientRepository repository;

  /**
   * Find client by person client.
   *
   * @param person the person
   * @return the client
   */
  public Client findClientByPerson(@Valid Person person) {
    return repository.findClientByPerson(person);
  }

  /**
   * Find client by person first name and person last name client.
   *
   * @param firstName the first name
   * @param lastName  the last name
   * @return the client
   */
  public Client findClientByPersonFirstNameAndPersonLastName(@Valid String firstName, @Valid String lastName) {
    return repository.findClientByPerson_FirstNameAndPerson_LastName(firstName, lastName);
  }

  /**
   * Find clients by address country list.
   *
   * @param country the country
   * @return the list
   */
  public List<Client> findClientsByAddressCountry(@Valid String country) {
    return repository.findClientsByAddress_Country(country);
  }

  /**
   * Find clients by address country iso 2 list.
   *
   * @param iso2 the iso 2
   * @return the list
   */
  public List<Client> findClientsByAddressCountryIso2(@Valid String iso2) {
    return repository.findClientsByAddress_CountryIso2(iso2);
  }
}
