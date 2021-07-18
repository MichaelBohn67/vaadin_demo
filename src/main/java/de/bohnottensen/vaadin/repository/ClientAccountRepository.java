package de.bohnottensen.vaadin.repository;

import de.bohnottensen.vaadin.model.Account;
import de.bohnottensen.vaadin.model.Client;
import de.bohnottensen.vaadin.model.ClientAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientAccountRepository extends JpaRepository<ClientAccount, Long> {

  ClientAccount findClientAccountByIdClient(Client client);

  List<ClientAccount> findClientAccountByIdAccount(Account account);
}