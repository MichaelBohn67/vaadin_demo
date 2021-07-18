package de.bohnottensen.vaadin.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * The type Person.
 */
@Data
@Entity
public class Person {

  @Column(name = "ID", nullable = false)
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String firstName;
  private String lastName;
  private LocalDate birthDate;
  private String birthPlace;

}
