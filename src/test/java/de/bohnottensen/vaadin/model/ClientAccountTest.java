package de.bohnottensen.vaadin.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ClientAccountTest {
  @Test
  void testCanEqual() {
    assertFalse((new ClientAccount()).canEqual("Other"));
  }

  @Test
  void testCanEqual2() {
    ClientAccount clientAccount = new ClientAccount();

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

    Account account = new Account();
    account.setCreateDate(LocalDate.ofEpochDay(1L));
    account.setId(123L);
    account.setAccountNumber(1234567890L);

    ClientAccount clientAccount1 = new ClientAccount();
    clientAccount1.setIdClient(client);
    clientAccount1.setId(123L);
    clientAccount1.setIdAccount(account);
    assertTrue(clientAccount.canEqual(clientAccount1));
  }

  @Test
  void testConstructor() {
    ClientAccount actualClientAccount = new ClientAccount();
    actualClientAccount.setId(123L);
    Account account = new Account();
    account.setCreateDate(LocalDate.ofEpochDay(1L));
    account.setId(123L);
    account.setAccountNumber(1234567890L);
    actualClientAccount.setIdAccount(account);
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
    actualClientAccount.setIdClient(client);
    assertEquals(123L, actualClientAccount.getId().longValue());
    assertSame(account, actualClientAccount.getIdAccount());
    assertSame(client, actualClientAccount.getIdClient());
    assertEquals("ClientAccount(id=123, idClient=Client(id=123, person=Person(id=123, firstName=Jane, lastName=Doe,"
        + " birthDate=1970-01-02, birthPlace=Birth Place), address=Address(id=123, street=Street, number=Number,"
        + " postCode=OX1 1PT, city=Oxford, country=Country, countryIso2=Country Iso2)), idAccount=Account(id=123,"
        + " accountNumber=1234567890, createDate=1970-01-02))", actualClientAccount.toString());
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

    Account account = new Account();
    account.setCreateDate(LocalDate.ofEpochDay(1L));
    account.setId(123L);
    account.setAccountNumber(1234567890L);

    ClientAccount clientAccount = new ClientAccount();
    clientAccount.setIdClient(client);
    clientAccount.setId(123L);
    clientAccount.setIdAccount(account);
    assertNotEquals(null, clientAccount);
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

    Account account = new Account();
    account.setCreateDate(LocalDate.ofEpochDay(1L));
    account.setId(123L);
    account.setAccountNumber(1234567890L);

    ClientAccount clientAccount = new ClientAccount();
    clientAccount.setIdClient(client);
    clientAccount.setId(123L);
    clientAccount.setIdAccount(account);
    assertNotEquals("Different type to ClientAccount", clientAccount);
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

    Account account = new Account();
    account.setCreateDate(LocalDate.ofEpochDay(1L));
    account.setId(123L);
    account.setAccountNumber(1234567890L);

    ClientAccount clientAccount = new ClientAccount();
    clientAccount.setIdClient(client);
    clientAccount.setId(123L);
    clientAccount.setIdAccount(account);
    assertEquals(clientAccount, clientAccount);
    int expectedHashCodeResult = clientAccount.hashCode();
    assertEquals(expectedHashCodeResult, clientAccount.hashCode());
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

    Account account = new Account();
    account.setCreateDate(LocalDate.ofEpochDay(1L));
    account.setId(123L);
    account.setAccountNumber(1234567890L);

    ClientAccount clientAccount = new ClientAccount();
    clientAccount.setIdClient(client);
    clientAccount.setId(123L);
    clientAccount.setIdAccount(account);

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

    Account account1 = new Account();
    account1.setCreateDate(LocalDate.ofEpochDay(1L));
    account1.setId(123L);
    account1.setAccountNumber(1234567890L);

    ClientAccount clientAccount1 = new ClientAccount();
    clientAccount1.setIdClient(client1);
    clientAccount1.setId(123L);
    clientAccount1.setIdAccount(account1);
    assertEquals(clientAccount, clientAccount1);
    int expectedHashCodeResult = clientAccount.hashCode();
    assertEquals(expectedHashCodeResult, clientAccount1.hashCode());
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

    Account account = new Account();
    account.setCreateDate(LocalDate.ofEpochDay(1L));
    account.setId(123L);
    account.setAccountNumber(1234567890L);

    ClientAccount clientAccount = new ClientAccount();
    clientAccount.setIdClient(client);
    clientAccount.setId(123L);
    clientAccount.setIdAccount(account);

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

    Account account1 = new Account();
    account1.setCreateDate(LocalDate.ofEpochDay(1L));
    account1.setId(123L);
    account1.setAccountNumber(1234567890L);

    ClientAccount clientAccount1 = new ClientAccount();
    clientAccount1.setIdClient(client1);
    clientAccount1.setId(123L);
    clientAccount1.setIdAccount(account1);
    assertNotEquals(clientAccount, clientAccount1);
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
    client.setId(123L);
    client.setPerson(person);
    client.setAddress(address);

    Account account = new Account();
    account.setCreateDate(LocalDate.ofEpochDay(1L));
    account.setId(123L);
    account.setAccountNumber(1234567890L);

    ClientAccount clientAccount = new ClientAccount();
    clientAccount.setIdClient(client);
    clientAccount.setId(0L);
    clientAccount.setIdAccount(account);

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

    Account account1 = new Account();
    account1.setCreateDate(LocalDate.ofEpochDay(1L));
    account1.setId(123L);
    account1.setAccountNumber(1234567890L);

    ClientAccount clientAccount1 = new ClientAccount();
    clientAccount1.setIdClient(client1);
    clientAccount1.setId(123L);
    clientAccount1.setIdAccount(account1);
    assertNotEquals(clientAccount, clientAccount1);
  }

  @Test
  void testEquals7() {
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

    Account account = new Account();
    account.setCreateDate(LocalDate.ofEpochDay(1L));
    account.setId(123L);
    account.setAccountNumber(1234567890L);

    ClientAccount clientAccount = new ClientAccount();
    clientAccount.setIdClient(client);
    clientAccount.setId(null);
    clientAccount.setIdAccount(account);

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

    Account account1 = new Account();
    account1.setCreateDate(LocalDate.ofEpochDay(1L));
    account1.setId(123L);
    account1.setAccountNumber(1234567890L);

    ClientAccount clientAccount1 = new ClientAccount();
    clientAccount1.setIdClient(client1);
    clientAccount1.setId(123L);
    clientAccount1.setIdAccount(account1);
    assertNotEquals(clientAccount, clientAccount1);
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

    Account account = new Account();
    account.setCreateDate(LocalDate.ofEpochDay(0L));
    account.setId(123L);
    account.setAccountNumber(1234567890L);

    ClientAccount clientAccount = new ClientAccount();
    clientAccount.setIdClient(client);
    clientAccount.setId(123L);
    clientAccount.setIdAccount(account);

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

    Account account1 = new Account();
    account1.setCreateDate(LocalDate.ofEpochDay(1L));
    account1.setId(123L);
    account1.setAccountNumber(1234567890L);

    ClientAccount clientAccount1 = new ClientAccount();
    clientAccount1.setIdClient(client1);
    clientAccount1.setId(123L);
    clientAccount1.setIdAccount(account1);
    assertNotEquals(clientAccount, clientAccount1);
  }
}

