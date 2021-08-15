package de.bohnottensen.vaadin.repository;

import de.bohnottensen.vaadin.model.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.time.LocalDate;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@DataJpaTest
class AccountRepositoryTest {

  @Autowired
  private AccountRepository accountRepository;

  @Autowired
  private TestEntityManager entityManager;

  @Test
  void givenNewAccount_whenSaved_thenSuccess() {
    Account account = new Account();
    account.setId(1L);
    account.setAccountNumber(123L);
    account.setCreateDate(LocalDate.now());

    Account insertedAccount = accountRepository.save(account);

    assertThat(entityManager.find(Account.class, insertedAccount.getId())).isEqualTo(account);

  }

  @Test
  void testFindAccountByAccountNumber() {
    Account account = new Account();
    account.setCreateDate(LocalDate.ofEpochDay(1L));
    account.setId(123L);
    account.setAccountNumber(1234567890L);

    Account account1 = new Account();
    account1.setCreateDate(LocalDate.ofEpochDay(1L));
    account1.setId(123L);
    account1.setAccountNumber(1234567890L);
    accountRepository.save(account);
    accountRepository.save(account1);
    assertNull(accountRepository.findAccountByAccountNumber(3L));
  }

  @Test
  void testFindAccountsByCreateDate() {
    Account account = new Account();
    account.setCreateDate(LocalDate.ofEpochDay(1L));
    account.setId(123L);
    account.setAccountNumber(1234567890L);

    Account account1 = new Account();
    account1.setCreateDate(LocalDate.ofEpochDay(1L));
    account1.setId(123L);
    account1.setAccountNumber(1234567890L);
    accountRepository.save(account);
    accountRepository.save(account1);
    assertEquals(1, accountRepository.findAccountsByCreateDate(LocalDate.ofEpochDay(1L)).size());
  }

  @Test
  void givenNewAccount_whenUpdate_thenSuccess() {
    Account newAccount = new Account();
    newAccount.setId(1L);
    newAccount.setAccountNumber(123L);
    newAccount.setCreateDate(LocalDate.now());
    entityManager.persist(newAccount);
    newAccount.setCreateDate(LocalDate.now().minusDays(3));

    Account insertedAccount = accountRepository.save(newAccount);

    assertThat(entityManager.find(Account.class, insertedAccount.getId())).isEqualTo(newAccount);

  }

  @Test
  void givenAccount_whenFindById_thenSuccess() {
    Account newAccount = new Account();
    newAccount.setId(1L);
    newAccount.setAccountNumber(123L);
    newAccount.setCreateDate(LocalDate.now());
    entityManager.persist(newAccount);

    Optional<Account> insertedAccount = accountRepository.findById(newAccount.getId());

    assertThat(insertedAccount).contains(newAccount);

  }

  @Test
  void givenAccount_whenDelete_thenSuccess() {
    Account newAccount = new Account();
    newAccount.setId(1L);
    newAccount.setAccountNumber(123L);
    newAccount.setCreateDate(LocalDate.now());
    entityManager.persist(newAccount);

    accountRepository.delete(newAccount);

    assertThat(entityManager.find(Account.class, newAccount.getId())).isNull();

  }
}