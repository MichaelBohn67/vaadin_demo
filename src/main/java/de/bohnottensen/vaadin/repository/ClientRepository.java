package de.bohnottensen.vaadin.repository;

import de.bohnottensen.vaadin.model.Client;
import de.bohnottensen.vaadin.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The interface Client repository.
 */
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

  /**
   * Find client by person client.
   *
   * @param person the person
   * @return the client
   */
  Client findClientByPerson(Person person);

  /**
   * Find client by person first name and person last name client.
   *
   * @param firstName the first name
   * @param lastName  the last name
   * @return the client
   */
  Client findClientByPerson_FirstNameAndPerson_LastName(String firstName, String lastName);

  /**
   * Find clients by address country list.
   *
   * @param country the country
   * @return the list
   */
  List<Client> findClientsByAddress_Country(String country);

  /**
   * Find clients by address country iso 2 list.
   *
   * @param iso2 the iso 2
   * @return the list
   */
  List<Client> findClientsByAddress_CountryIso2(String iso2);

}