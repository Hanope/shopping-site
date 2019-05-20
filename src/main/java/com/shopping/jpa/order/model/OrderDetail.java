package com.shopping.jpa.order.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class OrderDetail {

  @Id
  private String id;

  @ManyToOne
  private Order order;

  @OneToOne
  private Product product;

  @OneToMany(mappedBy = "orderDetail")
  private List<Option> options;

  private int quantity;

  private int discountUnitPrice;

  private int totalPrice;

}
