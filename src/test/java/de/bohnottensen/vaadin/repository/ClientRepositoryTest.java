package de.bohnottensen.vaadin.repository;

import de.bohnottensen.vaadin.model.Client;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class ClientRepositoryTest {

  @Autowired
  ClientRepository repository;

  @Autowired
  TestEntityManager entityManager;

  @Test
  void givenClient_whenSaved_thenSuccess() {
    Client newClient = new Client();

    Client insertedClient = repository.save(newClient);

    assertThat(entityManager.find(Client.class, insertedClient.getId())).isEqualTo(newClient);
  }
}