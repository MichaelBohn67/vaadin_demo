package de.bohnottensen.vaadin.model;

import lombok.Data;

import javax.persistence.*;

/**
 * The type Client account.
 */
@Data
@Table(name = "CLIENT_ACCOUNT")
@Entity
public class ClientAccount {
  @Column(name = "ID", nullable = false)
  @Id
  private Long id;
  @ManyToOne
  @JoinColumn(name="ID_CLIENT", nullable=false)
  private Client idClient;
  @ManyToOne
  @JoinColumn(name="ID_ACCOUNT", nullable=false)
  private Account idAccount;
}