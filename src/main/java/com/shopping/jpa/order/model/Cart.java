package com.shopping.jpa.order.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Cart {

  @Id
  private String id;

  @ManyToOne
  private Account account;

  @OneToMany(mappedBy = "cart")
  private List<CartDetail> cartDetails;

  private int totalPrice;

}
