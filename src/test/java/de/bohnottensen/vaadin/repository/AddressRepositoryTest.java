package de.bohnottensen.vaadin.repository;

import de.bohnottensen.vaadin.model.Address;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class AddressRepositoryTest {

  @Autowired
  AddressRepository addressRepository;

  @Autowired
  TestEntityManager entityManager;

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