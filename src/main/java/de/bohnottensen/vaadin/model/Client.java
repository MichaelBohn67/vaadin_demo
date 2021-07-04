package de.bohnottensen.vaadin.model;

import lombok.Data;

import javax.persistence.*;

/**
 * The type Client.
 */
@Data
@Entity
@Table(name="client")
public class Client {

  @Column(name = "ID", nullable = false)
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Long id;
  @ManyToOne
  @JoinColumn(name="ID_PERSON", nullable=false)
  private Person person;
  @ManyToOne
  @JoinColumn(name="iID_ADDRESS", nullable=false)
  private Address address;

}
