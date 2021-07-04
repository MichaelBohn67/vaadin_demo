package de.bohnottensen.vaadin.controller;


import de.bohnottensen.vaadin.model.Account;
import de.bohnottensen.vaadin.repository.AccountRepository;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AccountServiceTest {

  private final AccountRepository repositoryMock = mock(AccountRepository.class);
  private final Account accountMock = mock(Account.class);
  private final AccountService service = new AccountService(repositoryMock);

  @Test
  void givenFindAllReturnAddresses() {
    when(repositoryMock.findAll()).thenReturn(Collections.singletonList(accountMock));

    List<Account> result = service.findAllAccounts();

    assertThat(result, contains(accountMock));
  }

  @Test
  void givenAccountNumberReturnAccount() {
    when(repositoryMock.findAccountByAccountNumber(accountMock.getAccountNumber().toString())).thenReturn(accountMock);

    Account result = service.findByAccountNumber(accountMock.getAccountNumber().toString());

    assertThat(result, is(accountMock));
  }

  @Test
  void givenCreateDateReturnListOfAccounts() {
    when(repositoryMock.findAccountsByCreateDate(accountMock.getCreateDate())).thenReturn(Collections.singletonList(accountMock));

    List<Account> result = service.findByCreateDate(accountMock.getCreateDate());

    assertThat(result, contains(accountMock));

  }
}