package de.bohnottensen.vaadin.repository;

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
  TestEntityManager entityManager;

  @Test
  void givenClientAccount_whenSaved_thenSuccess() {
    ClientAccount newClientAccount = new ClientAccount();

    ClientAccount insertedClientAccount = repository.save(newClientAccount);

    assertThat(entityManager.find(ClientAccount.class, insertedClientAccount.getId())).isEqualTo(newClientAccount);
  }


}