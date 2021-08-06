package de.bohnottensen.vaadin.repository;

import de.bohnottensen.vaadin.model.Account;
import de.bohnottensen.vaadin.model.Client;
import de.bohnottensen.vaadin.model.ClientAccount;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class ClientAccountRepositoryTest {

  @Autowired
  ClientAccountRepository repository;
  @Autowired
  AccountRepository accountRepository;
  @Autowired
  ClientRepository clientRepository;

  @Autowired
  TestEntityManager entityManager;

  @Test
  void givenClientAccount_whenSaved_thenSuccess() {
    Account account = new Account();
    account.setId(1L);
    accountRepository.save(account);
    Client client = new Client();
    client.setId(1L);
    clientRepository.save(client);
    ClientAccount newClientAccount = new ClientAccount();
    newClientAccount.setId(1L);
    newClientAccount.setIdAccount(account);
    newClientAccount.setIdClient(client);
    ClientAccount insertedClientAccount = repository.save(newClientAccount);

    assertThat(entityManager.find(ClientAccount.class, insertedClientAccount.getId())).isEqualTo(newClientAccount);
  }


}