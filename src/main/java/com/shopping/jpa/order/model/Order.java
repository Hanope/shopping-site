package com.shopping.jpa.order.model;

import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Order {

  @Id
  private String id;

  @ManyToOne
  private Account account;

  private String ordererName;

  private String phone;

  private LocalDateTime orderDate;

  @Enumerated(EnumType.STRING)
  private OrderStatus orderStatus;

  @OneToMany(mappedBy = "order")
  private List<OrderDetail> orderDetails;

  private int totalPrice;

  public enum OrderStatus {
    WAIT_PAYMENT, COMPLETE_PAYMENT, CANCELD
  }

}
