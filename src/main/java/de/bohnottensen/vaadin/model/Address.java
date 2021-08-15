package de.bohnottensen.vaadin.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Address {
  @Column(name = "ID", nullable = false)
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String street;
  private String number;
  private String postCode;
  private String city;
  private String country;
  private String countryIso2;
}
