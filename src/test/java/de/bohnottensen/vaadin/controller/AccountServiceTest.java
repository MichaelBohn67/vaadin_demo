package de.bohnottensen.vaadin.controller;


import de.bohnottensen.vaadin.model.Account;
import de.bohnottensen.vaadin.repository.AccountRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

@ContextConfiguration(classes = {AccountService.class})
@ExtendWith(SpringExtension.class)
class AccountServiceTest {

  private final AccountRepository repositoryMock = mock(AccountRepository.class);
  private final Account accountMock = mock(Account.class);
  private final AccountService service = new AccountService(repositoryMock);
  @MockBean
  private AccountRepository accountRepository;
  @Autowired
  private AccountService accountService;

  @Test
  void givenFindAllReturnAddresses() {
    when(repositoryMock.findAll()).thenReturn(Collections.singletonList(accountMock));

    List<Account> result = service.findAllAccounts();

    assertThat(result, contains(accountMock));
  }

  @Test
  public void testFindAllAccounts() {
    ArrayList<Account> accountList = new ArrayList<>();
    when(accountRepository.findAll()).thenReturn(accountList);
    List<Account> actualFindAllAccountsResult = accountService.findAllAccounts();
    assertSame(accountList, actualFindAllAccountsResult);
    assertTrue(actualFindAllAccountsResult.isEmpty());
    verify(accountRepository).findAll();
  }

  @Test
  public void testFindByAccountNumber() {
    Account account = new Account();
    account.setCreateDate(LocalDate.ofEpochDay(1L));
    account.setId(123L);
    account.setAccountNumber(1234567890L);
    when(accountRepository.findAccountByAccountNumber(any())).thenReturn(account);
    assertSame(account, accountService.findByAccountNumber(1234567890L));
    verify(accountRepository).findAccountByAccountNumber(any());
    assertTrue(accountService.findAllAccounts().isEmpty());
  }

  @Test
  public void testFindByCreateDate() {
    ArrayList<Account> accountList = new ArrayList<>();
    when(accountRepository.findAccountsByCreateDate(any())).thenReturn(accountList);
    List<Account> actualFindByCreateDateResult = accountService.findByCreateDate(LocalDate.ofEpochDay(1L));
    assertSame(accountList, actualFindByCreateDateResult);
    assertTrue(actualFindByCreateDateResult.isEmpty());
    verify(accountRepository).findAccountsByCreateDate(any());
    assertTrue(accountService.findAllAccounts().isEmpty());
  }

  @Test
  void givenAccountNumberReturnAccount() {
    when(repositoryMock.findAccountByAccountNumber(accountMock.getAccountNumber())).thenReturn(accountMock);

    Account result = service.findByAccountNumber(accountMock.getAccountNumber());

    assertThat(result, is(accountMock));
  }

  @Test
  void givenCreateDateReturnListOfAccounts() {
    when(repositoryMock.findAccountsByCreateDate(accountMock.getCreateDate())).thenReturn(Collections.singletonList(accountMock));

    List<Account> result = service.findByCreateDate(accountMock.getCreateDate());

    assertThat(result, contains(accountMock));

  }
}