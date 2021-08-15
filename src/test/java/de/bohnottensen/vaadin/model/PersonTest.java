package de.bohnottensen.vaadin.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
  @Test
  void testCanEqual() {
    assertFalse((new Person()).canEqual("Other"));
  }

  @Test
  void testCanEqual2() {
    Person person = new Person();

    Person person1 = new Person();
    person1.setLastName("Doe");
    person1.setBirthDate(LocalDate.ofEpochDay(1L));
    person1.setId(123L);
    person1.setFirstName("Jane");
    person1.setBirthPlace("Birth Place");
    assertTrue(person.canEqual(person1));
  }

  @Test
  void testConstructor() {
    Person actualPerson = new Person();
    LocalDate ofEpochDayResult = LocalDate.ofEpochDay(1L);
    actualPerson.setBirthDate(ofEpochDayResult);
    actualPerson.setBirthPlace("Birth Place");
    actualPerson.setFirstName("Jane");
    actualPerson.setId(123L);
    actualPerson.setLastName("Doe");
    assertSame(ofEpochDayResult, actualPerson.getBirthDate());
    assertEquals("Birth Place", actualPerson.getBirthPlace());
    assertEquals("Jane", actualPerson.getFirstName());
    assertEquals(123L, actualPerson.getId().longValue());
    assertEquals("Doe", actualPerson.getLastName());
    assertEquals("Person(id=123, firstName=Jane, lastName=Doe, birthDate=1970-01-02, birthPlace=Birth Place)",
        actualPerson.toString());
  }

  @Test
  void testEquals() {
    Person person = new Person();
    person.setLastName("Doe");
    person.setBirthDate(LocalDate.ofEpochDay(1L));
    person.setId(123L);
    person.setFirstName("Jane");
    person.setBirthPlace("Birth Place");
    assertNotEquals(null, person);
  }

  @Test
  void testEquals10() {
    Person person = new Person();
    person.setLastName("Doe");
    person.setBirthDate(LocalDate.ofEpochDay(1L));
    person.setId(null);
    person.setFirstName("Jane");
    person.setBirthPlace("Birth Place");

    Person person1 = new Person();
    person1.setLastName("Doe");
    person1.setBirthDate(LocalDate.ofEpochDay(1L));
    person1.setId(123L);
    person1.setFirstName("Jane");
    person1.setBirthPlace("Birth Place");
    assertNotEquals(person, person1);
  }

  @Test
  void testEquals11() {
    Person person = new Person();
    person.setLastName("Doe");
    person.setBirthDate(LocalDate.ofEpochDay(1L));
    person.setId(123L);
    person.setFirstName(null);
    person.setBirthPlace("Birth Place");

    Person person1 = new Person();
    person1.setLastName("Doe");
    person1.setBirthDate(LocalDate.ofEpochDay(1L));
    person1.setId(123L);
    person1.setFirstName("Jane");
    person1.setBirthPlace("Birth Place");
    assertNotEquals(person, person1);
  }

  @Test
  void testEquals12() {
    Person person = new Person();
    person.setLastName("Doe");
    person.setBirthDate(LocalDate.ofEpochDay(1L));
    person.setId(123L);
    person.setFirstName("Doe");
    person.setBirthPlace("Birth Place");

    Person person1 = new Person();
    person1.setLastName("Doe");
    person1.setBirthDate(LocalDate.ofEpochDay(1L));
    person1.setId(123L);
    person1.setFirstName("Jane");
    person1.setBirthPlace("Birth Place");
    assertNotEquals(person, person1);
  }

  @Test
  void testEquals13() {
    Person person = new Person();
    person.setLastName("Doe");
    person.setBirthDate(LocalDate.ofEpochDay(1L));
    person.setId(123L);
    person.setFirstName("Jane");
    person.setBirthPlace("Jane");

    Person person1 = new Person();
    person1.setLastName("Doe");
    person1.setBirthDate(LocalDate.ofEpochDay(1L));
    person1.setId(123L);
    person1.setFirstName("Jane");
    person1.setBirthPlace("Birth Place");
    assertNotEquals(person, person1);
  }

  @Test
  void testEquals14() {
    Person person = new Person();
    person.setLastName("Doe");
    person.setBirthDate(LocalDate.ofEpochDay(1L));
    person.setId(123L);
    person.setFirstName("Jane");
    person.setBirthPlace(null);

    Person person1 = new Person();
    person1.setLastName("Doe");
    person1.setBirthDate(LocalDate.ofEpochDay(1L));
    person1.setId(123L);
    person1.setFirstName("Jane");
    person1.setBirthPlace("Birth Place");
    assertNotEquals(person, person1);
  }

  @Test
  void testEquals15() {
    Person person = new Person();
    person.setLastName(null);
    person.setBirthDate(LocalDate.ofEpochDay(1L));
    person.setId(123L);
    person.setFirstName("Jane");
    person.setBirthPlace("Birth Place");

    Person person1 = new Person();
    person1.setLastName(null);
    person1.setBirthDate(LocalDate.ofEpochDay(1L));
    person1.setId(123L);
    person1.setFirstName("Jane");
    person1.setBirthPlace("Birth Place");
    assertEquals(person, person1);
    int expectedHashCodeResult = person.hashCode();
    assertEquals(expectedHashCodeResult, person1.hashCode());
  }

  @Test
  void testEquals16() {
    Person person = new Person();
    person.setLastName("Doe");
    person.setBirthDate(null);
    person.setId(123L);
    person.setFirstName("Jane");
    person.setBirthPlace("Birth Place");

    Person person1 = new Person();
    person1.setLastName("Doe");
    person1.setBirthDate(null);
    person1.setId(123L);
    person1.setFirstName("Jane");
    person1.setBirthPlace("Birth Place");
    assertEquals(person, person1);
    int expectedHashCodeResult = person.hashCode();
    assertEquals(expectedHashCodeResult, person1.hashCode());
  }

  @Test
  void testEquals17() {
    Person person = new Person();
    person.setLastName("Doe");
    person.setBirthDate(LocalDate.ofEpochDay(1L));
    person.setId(null);
    person.setFirstName("Jane");
    person.setBirthPlace("Birth Place");

    Person person1 = new Person();
    person1.setLastName("Doe");
    person1.setBirthDate(LocalDate.ofEpochDay(1L));
    person1.setId(null);
    person1.setFirstName("Jane");
    person1.setBirthPlace("Birth Place");
    assertEquals(person, person1);
    int expectedHashCodeResult = person.hashCode();
    assertEquals(expectedHashCodeResult, person1.hashCode());
  }

  @Test
  void testEquals18() {
    Person person = new Person();
    person.setLastName("Doe");
    person.setBirthDate(LocalDate.ofEpochDay(1L));
    person.setId(123L);
    person.setFirstName(null);
    person.setBirthPlace("Birth Place");

    Person person1 = new Person();
    person1.setLastName("Doe");
    person1.setBirthDate(LocalDate.ofEpochDay(1L));
    person1.setId(123L);
    person1.setFirstName(null);
    person1.setBirthPlace("Birth Place");
    assertEquals(person, person1);
    int expectedHashCodeResult = person.hashCode();
    assertEquals(expectedHashCodeResult, person1.hashCode());
  }

  @Test
  void testEquals2() {
    Person person = new Person();
    person.setLastName("Doe");
    person.setBirthDate(LocalDate.ofEpochDay(1L));
    person.setId(123L);
    person.setFirstName("Jane");
    person.setBirthPlace("Birth Place");
    assertNotEquals("Different type to Person", person);
  }

  @Test
  void testEquals3() {
    Person person = new Person();
    person.setLastName("Doe");
    person.setBirthDate(LocalDate.ofEpochDay(1L));
    person.setId(123L);
    person.setFirstName("Jane");
    person.setBirthPlace("Birth Place");
    assertEquals(person, person);
    int expectedHashCodeResult = person.hashCode();
    assertEquals(expectedHashCodeResult, person.hashCode());
  }

  @Test
  void testEquals4() {
    Person person = new Person();
    person.setLastName("Doe");
    person.setBirthDate(LocalDate.ofEpochDay(1L));
    person.setId(123L);
    person.setFirstName("Jane");
    person.setBirthPlace("Birth Place");

    Person person1 = new Person();
    person1.setLastName("Doe");
    person1.setBirthDate(LocalDate.ofEpochDay(1L));
    person1.setId(123L);
    person1.setFirstName("Jane");
    person1.setBirthPlace("Birth Place");
    assertEquals(person, person1);
    int expectedHashCodeResult = person.hashCode();
    assertEquals(expectedHashCodeResult, person1.hashCode());
  }

  @Test
  void testEquals5() {
    Person person = new Person();
    person.setLastName("Jane");
    person.setBirthDate(LocalDate.ofEpochDay(1L));
    person.setId(123L);
    person.setFirstName("Jane");
    person.setBirthPlace("Birth Place");

    Person person1 = new Person();
    person1.setLastName("Doe");
    person1.setBirthDate(LocalDate.ofEpochDay(1L));
    person1.setId(123L);
    person1.setFirstName("Jane");
    person1.setBirthPlace("Birth Place");
    assertNotEquals(person, person1);
  }

  @Test
  void testEquals6() {
    Person person = new Person();
    person.setLastName(null);
    person.setBirthDate(LocalDate.ofEpochDay(1L));
    person.setId(123L);
    person.setFirstName("Jane");
    person.setBirthPlace("Birth Place");

    Person person1 = new Person();
    person1.setLastName("Doe");
    person1.setBirthDate(LocalDate.ofEpochDay(1L));
    person1.setId(123L);
    person1.setFirstName("Jane");
    person1.setBirthPlace("Birth Place");
    assertNotEquals(person, person1);
  }

  @Test
  void testEquals7() {
    Person person = new Person();
    person.setLastName("Doe");
    person.setBirthDate(LocalDate.ofEpochDay(0L));
    person.setId(123L);
    person.setFirstName("Jane");
    person.setBirthPlace("Birth Place");

    Person person1 = new Person();
    person1.setLastName("Doe");
    person1.setBirthDate(LocalDate.ofEpochDay(1L));
    person1.setId(123L);
    person1.setFirstName("Jane");
    person1.setBirthPlace("Birth Place");
    assertNotEquals(person, person1);
  }

  @Test
  void testEquals8() {
    Person person = new Person();
    person.setLastName("Doe");
    person.setBirthDate(null);
    person.setId(123L);
    person.setFirstName("Jane");
    person.setBirthPlace("Birth Place");

    Person person1 = new Person();
    person1.setLastName("Doe");
    person1.setBirthDate(LocalDate.ofEpochDay(1L));
    person1.setId(123L);
    person1.setFirstName("Jane");
    person1.setBirthPlace("Birth Place");
    assertNotEquals(person, person1);
  }

  @Test
  void testEquals9() {
    Person person = new Person();
    person.setLastName("Doe");
    person.setBirthDate(LocalDate.ofEpochDay(1L));
    person.setId(0L);
    person.setFirstName("Jane");
    person.setBirthPlace("Birth Place");

    Person person1 = new Person();
    person1.setLastName("Doe");
    person1.setBirthDate(LocalDate.ofEpochDay(1L));
    person1.setId(123L);
    person1.setFirstName("Jane");
    person1.setBirthPlace("Birth Place");
    assertNotEquals(person, person1);
  }
}

