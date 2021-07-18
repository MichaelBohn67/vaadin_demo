package de.bohnottensen.vaadin;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class VaadinApplicationTests {

  @Autowired
  private VaadinApplication controller;


  @Test
  void contextLoads() {
    assertThat(controller).isNotNull();
  }

}
