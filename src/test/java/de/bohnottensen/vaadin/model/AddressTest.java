package de.bohnottensen.vaadin.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {
  @Test
  void testCanEqual() {
    assertFalse((new Address()).canEqual("Other"));
  }

  @Test
  void testCanEqual2() {
    Address address = new Address();

    Address address1 = new Address();
    address1.setNumber("Number");
    address1.setCountry("Country");
    address1.setId(123L);
    address1.setCity("Oxford");
    address1.setCountryIso2("Country Iso2");
    address1.setPostCode("OX1 1PT");
    address1.setStreet("Street");
    assertTrue(address.canEqual(address1));
  }

  @Test
  void testConstructor() {
    Address actualAddress = new Address();
    actualAddress.setCity("Oxford");
    actualAddress.setCountry("Country");
    actualAddress.setCountryIso2("Country Iso2");
    actualAddress.setId(123L);
    actualAddress.setNumber("Number");
    actualAddress.setPostCode("OX1 1PT");
    actualAddress.setStreet("Street");
    assertEquals("Oxford", actualAddress.getCity());
    assertEquals("Country", actualAddress.getCountry());
    assertEquals("Country Iso2", actualAddress.getCountryIso2());
    assertEquals(123L, actualAddress.getId().longValue());
    assertEquals("Number", actualAddress.getNumber());
    assertEquals("OX1 1PT", actualAddress.getPostCode());
    assertEquals("Street", actualAddress.getStreet());
    assertEquals("Address(id=123, street=Street, number=Number, postCode=OX1 1PT, city=Oxford, country=Country,"
        + " countryIso2=Country Iso2)", actualAddress.toString());
  }

  @Test
  void testEquals() {
    Address address = new Address();
    address.setNumber("Number");
    address.setCountry("Country");
    address.setId(123L);
    address.setCity("Oxford");
    address.setCountryIso2("Country Iso2");
    address.setPostCode("OX1 1PT");
    address.setStreet("Street");
    assertNotEquals(null, address);
  }

  @Test
  void testEquals10() {
    Address address = new Address();
    address.setNumber("Number");
    address.setCountry("Country");
    address.setId(null);
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
    assertNotEquals(address, address1);
  }

  @Test
  void testEquals11() {
    Address address = new Address();
    address.setNumber("Number");
    address.setCountry("Country");
    address.setId(123L);
    address.setCity("Street");
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
    assertNotEquals(address, address1);
  }

  @Test
  void testEquals12() {
    Address address = new Address();
    address.setNumber("Number");
    address.setCountry("Country");
    address.setId(123L);
    address.setCity(null);
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
    assertNotEquals(address, address1);
  }

  @Test
  void testEquals13() {
    Address address = new Address();
    address.setNumber("Number");
    address.setCountry("Country");
    address.setId(123L);
    address.setCity("Oxford");
    address.setCountryIso2("Street");
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
    assertNotEquals(address, address1);
  }

  @Test
  void testEquals14() {
    Address address = new Address();
    address.setNumber("Number");
    address.setCountry("Country");
    address.setId(123L);
    address.setCity("Oxford");
    address.setCountryIso2(null);
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
    assertNotEquals(address, address1);
  }

  @Test
  void testEquals15() {
    Address address = new Address();
    address.setNumber("Number");
    address.setCountry("Country");
    address.setId(123L);
    address.setCity("Oxford");
    address.setCountryIso2("Country Iso2");
    address.setPostCode("Street");
    address.setStreet("Street");

    Address address1 = new Address();
    address1.setNumber("Number");
    address1.setCountry("Country");
    address1.setId(123L);
    address1.setCity("Oxford");
    address1.setCountryIso2("Country Iso2");
    address1.setPostCode("OX1 1PT");
    address1.setStreet("Street");
    assertNotEquals(address, address1);
  }

  @Test
  void testEquals16() {
    Address address = new Address();
    address.setNumber("Number");
    address.setCountry("Country");
    address.setId(123L);
    address.setCity("Oxford");
    address.setCountryIso2("Country Iso2");
    address.setPostCode(null);
    address.setStreet("Street");

    Address address1 = new Address();
    address1.setNumber("Number");
    address1.setCountry("Country");
    address1.setId(123L);
    address1.setCity("Oxford");
    address1.setCountryIso2("Country Iso2");
    address1.setPostCode("OX1 1PT");
    address1.setStreet("Street");
    assertNotEquals(address, address1);
  }

  @Test
  void testEquals17() {
    Address address = new Address();
    address.setNumber("Number");
    address.setCountry("Country");
    address.setId(123L);
    address.setCity("Oxford");
    address.setCountryIso2("Country Iso2");
    address.setPostCode("OX1 1PT");
    address.setStreet(null);

    Address address1 = new Address();
    address1.setNumber("Number");
    address1.setCountry("Country");
    address1.setId(123L);
    address1.setCity("Oxford");
    address1.setCountryIso2("Country Iso2");
    address1.setPostCode("OX1 1PT");
    address1.setStreet("Street");
    assertNotEquals(address, address1);
  }

  @Test
  void testEquals18() {
    Address address = new Address();
    address.setNumber("Number");
    address.setCountry("Country");
    address.setId(123L);
    address.setCity("Oxford");
    address.setCountryIso2("Country Iso2");
    address.setPostCode("OX1 1PT");
    address.setStreet("Number");

    Address address1 = new Address();
    address1.setNumber("Number");
    address1.setCountry("Country");
    address1.setId(123L);
    address1.setCity("Oxford");
    address1.setCountryIso2("Country Iso2");
    address1.setPostCode("OX1 1PT");
    address1.setStreet("Street");
    assertNotEquals(address, address1);
  }

  @Test
  void testEquals19() {
    Address address = new Address();
    address.setNumber(null);
    address.setCountry("Country");
    address.setId(123L);
    address.setCity("Oxford");
    address.setCountryIso2("Country Iso2");
    address.setPostCode("OX1 1PT");
    address.setStreet("Street");

    Address address1 = new Address();
    address1.setNumber(null);
    address1.setCountry("Country");
    address1.setId(123L);
    address1.setCity("Oxford");
    address1.setCountryIso2("Country Iso2");
    address1.setPostCode("OX1 1PT");
    address1.setStreet("Street");
    assertEquals(address, address1);
    int expectedHashCodeResult = address.hashCode();
    assertEquals(expectedHashCodeResult, address1.hashCode());
  }

  @Test
  void testEquals2() {
    Address address = new Address();
    address.setNumber("Number");
    address.setCountry("Country");
    address.setId(123L);
    address.setCity("Oxford");
    address.setCountryIso2("Country Iso2");
    address.setPostCode("OX1 1PT");
    address.setStreet("Street");
    assertNotEquals("Different type to Address", address);
  }

  @Test
  void testEquals20() {
    Address address = new Address();
    address.setNumber("Number");
    address.setCountry(null);
    address.setId(123L);
    address.setCity("Oxford");
    address.setCountryIso2("Country Iso2");
    address.setPostCode("OX1 1PT");
    address.setStreet("Street");

    Address address1 = new Address();
    address1.setNumber("Number");
    address1.setCountry(null);
    address1.setId(123L);
    address1.setCity("Oxford");
    address1.setCountryIso2("Country Iso2");
    address1.setPostCode("OX1 1PT");
    address1.setStreet("Street");
    assertEquals(address, address1);
    int expectedHashCodeResult = address.hashCode();
    assertEquals(expectedHashCodeResult, address1.hashCode());
  }

  @Test
  void testEquals21() {
    Address address = new Address();
    address.setNumber("Number");
    address.setCountry("Country");
    address.setId(null);
    address.setCity("Oxford");
    address.setCountryIso2("Country Iso2");
    address.setPostCode("OX1 1PT");
    address.setStreet("Street");

    Address address1 = new Address();
    address1.setNumber("Number");
    address1.setCountry("Country");
    address1.setId(null);
    address1.setCity("Oxford");
    address1.setCountryIso2("Country Iso2");
    address1.setPostCode("OX1 1PT");
    address1.setStreet("Street");
    assertEquals(address, address1);
    int expectedHashCodeResult = address.hashCode();
    assertEquals(expectedHashCodeResult, address1.hashCode());
  }

  @Test
  void testEquals3() {
    Address address = new Address();
    address.setNumber("Number");
    address.setCountry("Country");
    address.setId(123L);
    address.setCity("Oxford");
    address.setCountryIso2("Country Iso2");
    address.setPostCode("OX1 1PT");
    address.setStreet("Street");
    assertEquals(address, address);
    int expectedHashCodeResult = address.hashCode();
    assertEquals(expectedHashCodeResult, address.hashCode());
  }

  @Test
  void testEquals4() {
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
    assertEquals(address, address1);
    int expectedHashCodeResult = address.hashCode();
    assertEquals(expectedHashCodeResult, address1.hashCode());
  }

  @Test
  void testEquals5() {
    Address address = new Address();
    address.setNumber("Street");
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
    assertNotEquals(address, address1);
  }

  @Test
  void testEquals6() {
    Address address = new Address();
    address.setNumber(null);
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
    assertNotEquals(address, address1);
  }

  @Test
  void testEquals7() {
    Address address = new Address();
    address.setNumber("Number");
    address.setCountry("Street");
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
    assertNotEquals(address, address1);
  }

  @Test
  void testEquals8() {
    Address address = new Address();
    address.setNumber("Number");
    address.setCountry(null);
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
    assertNotEquals(address, address1);
  }

  @Test
  void testEquals9() {
    Address address = new Address();
    address.setNumber("Number");
    address.setCountry("Country");
    address.setId(0L);
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
    assertNotEquals(address, address1);
  }
}

