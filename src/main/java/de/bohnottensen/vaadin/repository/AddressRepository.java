package de.bohnottensen.vaadin.repository;

import de.bohnottensen.vaadin.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Address repository.
 */
@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

  /**
   * Find address by street and and number and city and country address.
   *
   * @param street  the street
   * @param number  the number
   * @param city    the city
   * @param country the country
   * @return the address
   */
  Address findAddressByStreetAndAndNumberAndCityAndCountry(String street, String number, String city, String country);

}