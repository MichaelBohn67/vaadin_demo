package de.bohnottensen.vaadin.controller;

import de.bohnottensen.vaadin.model.Account;
import de.bohnottensen.vaadin.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

/**
 * The type Account service.
 */
@RequiredArgsConstructor
@Service
public class AccountService {

  private final AccountRepository repository;

  /**
   * Find all accounts list.
   *
   * @return the list
   */
  public List<Account> findAllAccounts() {
    return repository.findAll();
  }

  /**
   * Find by account number account.
   *
   * @param accountNumber the account number
   * @return the account
   */
  public Account findByAccountNumber(@Valid String accountNumber) {
    return repository.findAccountByAccountNumber(accountNumber);
  }

  /**
   * Find by create date list.
   *
   * @param createDate the create date
   * @return the list
   */
  public List<Account> findByCreateDate(@Valid LocalDate createDate) {
    return repository.findAccountsByCreateDate(createDate);
  }
}
