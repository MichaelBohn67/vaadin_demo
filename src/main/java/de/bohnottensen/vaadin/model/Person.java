package de.bohnottensen.vaadin.model;

import lombok.Data;

import javax.persistence.*;

/**
 * The type Person.
 */
@Data
@Entity
public class Person {

  @Column(name = "ID", nullable = false)
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Long id;
  private String firstName;
  private String lastName;
  private String birthDate;
  private String birthPlace;

}
