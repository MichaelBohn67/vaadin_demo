package de.bohnottensen.vaadin.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
  @Test
  void testCanEqual() {
    assertFalse((new Account()).canEqual("Other"));
  }

  @Test
  void testCanEqual2() {
    Account account = new Account();

    Account account1 = new Account();
    account1.setCreateDate(LocalDate.ofEpochDay(1L));
    account1.setId(123L);
    account1.setAccountNumber(1234567890L);
    assertTrue(account.canEqual(account1));
  }

  @Test
  void testConstructor() {
    Account actualAccount = new Account();
    actualAccount.setAccountNumber(1234567890L);
    LocalDate ofEpochDayResult = LocalDate.ofEpochDay(1L);
    actualAccount.setCreateDate(ofEpochDayResult);
    actualAccount.setId(123L);
    assertEquals(1234567890L, actualAccount.getAccountNumber().longValue());
    assertSame(ofEpochDayResult, actualAccount.getCreateDate());
    assertEquals(123L, actualAccount.getId().longValue());
    assertEquals("Account(id=123, accountNumber=1234567890, createDate=1970-01-02)", actualAccount.toString());
  }

  @Test
  void testEquals() {
    Account account = new Account();
    account.setCreateDate(LocalDate.ofEpochDay(1L));
    account.setId(123L);
    account.setAccountNumber(1234567890L);
    assertNotEquals(null, account);
  }

  @Test
  void testEquals10() {
    Account account = new Account();
    account.setCreateDate(LocalDate.ofEpochDay(1L));
    account.setId(123L);
    account.setAccountNumber(null);

    Account account1 = new Account();
    account1.setCreateDate(LocalDate.ofEpochDay(1L));
    account1.setId(123L);
    account1.setAccountNumber(1234567890L);
    assertNotEquals(account, account1);
  }

  @Test
  void testEquals11() {
    Account account = new Account();
    account.setCreateDate(null);
    account.setId(123L);
    account.setAccountNumber(1234567890L);

    Account account1 = new Account();
    account1.setCreateDate(null);
    account1.setId(123L);
    account1.setAccountNumber(1234567890L);
    assertEquals(account, account1);
    int expectedHashCodeResult = account.hashCode();
    assertEquals(expectedHashCodeResult, account1.hashCode());
  }

  @Test
  void testEquals12() {
    Account account = new Account();
    account.setCreateDate(LocalDate.ofEpochDay(1L));
    account.setId(null);
    account.setAccountNumber(1234567890L);

    Account account1 = new Account();
    account1.setCreateDate(LocalDate.ofEpochDay(1L));
    account1.setId(null);
    account1.setAccountNumber(1234567890L);
    assertEquals(account, account1);
    int expectedHashCodeResult = account.hashCode();
    assertEquals(expectedHashCodeResult, account1.hashCode());
  }

  @Test
  void testEquals13() {
    Account account = new Account();
    account.setCreateDate(LocalDate.ofEpochDay(1L));
    account.setId(123L);
    account.setAccountNumber(null);

    Account account1 = new Account();
    account1.setCreateDate(LocalDate.ofEpochDay(1L));
    account1.setId(123L);
    account1.setAccountNumber(null);
    assertEquals(account, account1);
    int expectedHashCodeResult = account.hashCode();
    assertEquals(expectedHashCodeResult, account1.hashCode());
  }

  @Test
  void testEquals2() {
    Account account = new Account();
    account.setCreateDate(LocalDate.ofEpochDay(1L));
    account.setId(123L);
    account.setAccountNumber(1234567890L);
    assertNotEquals("Different type to Account", account);
  }

  @Test
  void testEquals3() {
    Account account = new Account();
    account.setCreateDate(LocalDate.ofEpochDay(1L));
    account.setId(123L);
    account.setAccountNumber(1234567890L);
    assertEquals(account, account);
    int expectedHashCodeResult = account.hashCode();
    assertEquals(expectedHashCodeResult, account.hashCode());
  }

  @Test
  void testEquals4() {
    Account account = new Account();
    account.setCreateDate(LocalDate.ofEpochDay(1L));
    account.setId(123L);
    account.setAccountNumber(1234567890L);

    Account account1 = new Account();
    account1.setCreateDate(LocalDate.ofEpochDay(1L));
    account1.setId(123L);
    account1.setAccountNumber(1234567890L);
    assertEquals(account, account1);
    int expectedHashCodeResult = account.hashCode();
    assertEquals(expectedHashCodeResult, account1.hashCode());
  }

  @Test
  void testEquals5() {
    Account account = new Account();
    account.setCreateDate(LocalDate.ofEpochDay(0L));
    account.setId(123L);
    account.setAccountNumber(1234567890L);

    Account account1 = new Account();
    account1.setCreateDate(LocalDate.ofEpochDay(1L));
    account1.setId(123L);
    account1.setAccountNumber(1234567890L);
    assertNotEquals(account, account1);
  }

  @Test
  void testEquals6() {
    Account account = new Account();
    account.setCreateDate(null);
    account.setId(123L);
    account.setAccountNumber(1234567890L);

    Account account1 = new Account();
    account1.setCreateDate(LocalDate.ofEpochDay(1L));
    account1.setId(123L);
    account1.setAccountNumber(1234567890L);
    assertNotEquals(account, account1);
  }

  @Test
  void testEquals7() {
    Account account = new Account();
    account.setCreateDate(LocalDate.ofEpochDay(1L));
    account.setId(0L);
    account.setAccountNumber(1234567890L);

    Account account1 = new Account();
    account1.setCreateDate(LocalDate.ofEpochDay(1L));
    account1.setId(123L);
    account1.setAccountNumber(1234567890L);
    assertNotEquals(account, account1);
  }

  @Test
  void testEquals8() {
    Account account = new Account();
    account.setCreateDate(LocalDate.ofEpochDay(1L));
    account.setId(null);
    account.setAccountNumber(1234567890L);

    Account account1 = new Account();
    account1.setCreateDate(LocalDate.ofEpochDay(1L));
    account1.setId(123L);
    account1.setAccountNumber(1234567890L);
    assertNotEquals(account, account1);
  }

  @Test
  void testEquals9() {
    Account account = new Account();
    account.setCreateDate(LocalDate.ofEpochDay(1L));
    account.setId(123L);
    account.setAccountNumber(3L);

    Account account1 = new Account();
    account1.setCreateDate(LocalDate.ofEpochDay(1L));
    account1.setId(123L);
    account1.setAccountNumber(1234567890L);
    assertNotEquals(account, account1);
  }
}

