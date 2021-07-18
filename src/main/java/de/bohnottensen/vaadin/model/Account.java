package de.bohnottensen.vaadin.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Table(name = "ACCOUNT")
@Entity
public class Account {

  @Column(name = "ID", nullable = false)
  @Id
  private Long id;
  private Long accountNumber;
  private LocalDate createDate;


}