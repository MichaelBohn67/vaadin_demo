package de.bohnottensen.vaadin.repository;

import de.bohnottensen.vaadin.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
  Account findAccountByAccountNumber(String accountNumber);

  List<Account> findAccountsByCreateDate(LocalDate createDate);

}