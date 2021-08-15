package de.bohnottensen.vaadin.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
  @Test
  void testCanEqual() {
    assertFalse((new Client()).canEqual("Other"));
  }

  @Test
  void testCanEqual2() {
    Client client = new Client();

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

    Client client1 = new Client();
    client1.setId(123L);
    client1.setPerson(person);
    client1.setAddress(address);
    assertTrue(client.canEqual(client1));
  }

  @Test
  void testConstructor() {
    Client actualClient = new Client();
    Address address = new Address();
    address.setNumber("Number");
    address.setCountry("Country");
    address.setId(123L);
    address.setCity("Oxford");
    address.setCountryIso2("Country Iso2");
    address.setPostCode("OX1 1PT");
    address.setStreet("Street");
    actualClient.setAddress(address);
    actualClient.setId(123L);
    Person person = new Person();
    person.setLastName("Doe");
    person.setBirthDate(LocalDate.ofEpochDay(1L));
    person.setId(123L);
    person.setFirstName("Jane");
    person.setBirthPlace("Birth Place");
    actualClient.setPerson(person);
    assertSame(address, actualClient.getAddress());
    assertEquals(123L, actualClient.getId().longValue());
    assertSame(person, actualClient.getPerson());
    assertEquals(
        "Client(id=123, person=Person(id=123, firstName=Jane, lastName=Doe, birthDate=1970-01-02, birthPlace=Birth"
            + " Place), address=Address(id=123, street=Street, number=Number, postCode=OX1 1PT, city=Oxford,"
            + " country=Country, countryIso2=Country Iso2))",
        actualClient.toString());
  }

  @Test
  void testEquals() {
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
    assertNotEquals(null, client);
  }

  @Test
  void testEquals2() {
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
    assertNotEquals("Different type to Client", client);
  }

  @Test
  void testEquals3() {
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
    assertEquals(client, client);
    int expectedHashCodeResult = client.hashCode();
    assertEquals(expectedHashCodeResult, client.hashCode());
  }

  @Test
  void testEquals4() {
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

    Person person1 = new Person();
    person1.setLastName("Doe");
    person1.setBirthDate(LocalDate.ofEpochDay(1L));
    person1.setId(123L);
    person1.setFirstName("Jane");
    person1.setBirthPlace("Birth Place");

    Address address1 = new Address();
    address1.setNumber("Number");
    address1.setCountry("Country");
    address1.setId(123L);
    address1.setCity("Oxford");
    address1.setCountryIso2("Country Iso2");
    address1.setPostCode("OX1 1PT");
    address1.setStreet("Street");

    Client client1 = new Client();
    client1.setId(123L);
    client1.setPerson(person1);
    client1.setAddress(address1);
    assertEquals(client, client1);
    int expectedHashCodeResult = client.hashCode();
    assertEquals(expectedHashCodeResult, client1.hashCode());
  }

  @Test
  void testEquals5() {
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
    client.setId(0L);
    client.setPerson(person);
    client.setAddress(address);

    Person person1 = new Person();
    person1.setLastName("Doe");
    person1.setBirthDate(LocalDate.ofEpochDay(1L));
    person1.setId(123L);
    person1.setFirstName("Jane");
    person1.setBirthPlace("Birth Place");

    Address address1 = new Address();
    address1.setNumber("Number");
    address1.setCountry("Country");
    address1.setId(123L);
    address1.setCity("Oxford");
    address1.setCountryIso2("Country Iso2");
    address1.setPostCode("OX1 1PT");
    address1.setStreet("Street");

    Client client1 = new Client();
    client1.setId(123L);
    client1.setPerson(person1);
    client1.setAddress(address1);
    assertNotEquals(client, client1);
  }

  @Test
  void testEquals6() {
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
    client.setId(null);
    client.setPerson(person);
    client.setAddress(address);

    Person person1 = new Person();
    person1.setLastName("Doe");
    person1.setBirthDate(LocalDate.ofEpochDay(1L));
    person1.setId(123L);
    person1.setFirstName("Jane");
    person1.setBirthPlace("Birth Place");

    Address address1 = new Address();
    address1.setNumber("Number");
    address1.setCountry("Country");
    address1.setId(123L);
    address1.setCity("Oxford");
    address1.setCountryIso2("Country Iso2");
    address1.setPostCode("OX1 1PT");
    address1.setStreet("Street");

    Client client1 = new Client();
    client1.setId(123L);
    client1.setPerson(person1);
    client1.setAddress(address1);
    assertNotEquals(client, client1);
  }

  @Test
  void testEquals7() {
    Person person = new Person();
    person.setLastName("Jane");
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

    Person person1 = new Person();
    person1.setLastName("Doe");
    person1.setBirthDate(LocalDate.ofEpochDay(1L));
    person1.setId(123L);
    person1.setFirstName("Jane");
    person1.setBirthPlace("Birth Place");

    Address address1 = new Address();
    address1.setNumber("Number");
    address1.setCountry("Country");
    address1.setId(123L);
    address1.setCity("Oxford");
    address1.setCountryIso2("Country Iso2");
    address1.setPostCode("OX1 1PT");
    address1.setStreet("Street");

    Client client1 = new Client();
    client1.setId(123L);
    client1.setPerson(person1);
    client1.setAddress(address1);
    assertNotEquals(client, client1);
  }

  @Test
  void testEquals8() {
    Person person = new Person();
    person.setLastName("Doe");
    person.setBirthDate(LocalDate.ofEpochDay(1L));
    person.setId(123L);
    person.setFirstName("Jane");
    person.setBirthPlace("Birth Place");

    Address address = new Address();
    address.setNumber("Jane");
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

    Person person1 = new Person();
    person1.setLastName("Doe");
    person1.setBirthDate(LocalDate.ofEpochDay(1L));
    person1.setId(123L);
    person1.setFirstName("Jane");
    person1.setBirthPlace("Birth Place");

    Address address1 = new Address();
    address1.setNumber("Number");
    address1.setCountry("Country");
    address1.setId(123L);
    address1.setCity("Oxford");
    address1.setCountryIso2("Country Iso2");
    address1.setPostCode("OX1 1PT");
    address1.setStreet("Street");

    Client client1 = new Client();
    client1.setId(123L);
    client1.setPerson(person1);
    client1.setAddress(address1);
    assertNotEquals(client, client1);
  }
}

