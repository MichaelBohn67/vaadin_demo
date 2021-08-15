package de.bohnottensen.vaadin.repository;

import de.bohnottensen.vaadin.model.Address;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;

@DataJpaTest
class AddressRepositoryTest {

  @Autowired
  private AddressRepository addressRepository;

  @Autowired
  private TestEntityManager entityManager;

  @Test
  void givenAddress_whenSaved_thenSuccess() {
    Address newAddress = new Address();
    newAddress.setCity("Hamburg");
    newAddress.setStreet("Hohe Bleichen");
    newAddress.setNumber("12");
    newAddress.setCountry("Germany");
    newAddress.setCountryIso2("DE");
    newAddress.setPostCode("22767");

    Address insertedAddress = addressRepository.save(newAddress);

    assertThat(entityManager.find(Address.class, insertedAddress.getId())).isEqualTo(newAddress);
    entityManager.flush();
  }

  @Test
  public void testFindAddressByStreetAndNumberAndCityAndCountry() {
    Address address = new Address();
    address.setNumber("Number");
    address.setCountry("Country");
    address.setId(123L);
    address.setCity("Oxford");
    address.setCountryIso2("Country Iso2");
    address.setPostCode("OX1 1PT");
    address.setStreet("Street");

    Address address1 = new Address();
    address1.setNumber("Number");
    address1.setCountry("Country");
    address1.setId(123L);
    address1.setCity("Oxford");
    address1.setCountryIso2("Country Iso2");
    address1.setPostCode("OX1 1PT");
    address1.setStreet("Street");
    addressRepository.save(address);
    addressRepository.save(address1);
    assertNull(addressRepository.findAddressByStreetAndNumberAndCityAndCountry("foo", "foo", "foo", "foo"));
  }

  @Test
  void givenAddress_whenUpdate_thenSuccess() {
    Address newAddress = new Address();
    newAddress.setCity("Hamburg");
    newAddress.setStreet("Hohe Bleichen");
    newAddress.setNumber("12");
    newAddress.setCountry("Germany");
    newAddress.setCountryIso2("DE");
    newAddress.setPostCode("22767");
    entityManager.merge(newAddress);

    newAddress.setPostCode("22678");

    Address insertedAddress = addressRepository.save(newAddress);

    assertThat(entityManager.find(Address.class, insertedAddress.getId())).isEqualTo(newAddress);
  }

  @Test
  void givenAddress_whenDelete_thenSuccess() {
    Address newAddress = new Address();
    newAddress.setId(1L);
    newAddress.setCity("Hamburg");
    newAddress.setStreet("Hohe Bleichen");
    newAddress.setNumber("12");
    newAddress.setCountry("Germany");
    newAddress.setCountryIso2("DE");
    newAddress.setPostCode("22767");
    entityManager.merge(newAddress);

    addressRepository.delete(newAddress);

    assertThat(entityManager.find(Address.class, newAddress.getId())).isNull();
  }
}