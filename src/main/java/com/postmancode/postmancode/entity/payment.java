package com.postmancode.postmancode.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "payment")
@Data
public class payment implements Serializable
{
   private static final long serialVersionUID = 1L;
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   @Column(name = "pay_id")
   private int pay_id;
   @Column(name="due_amount")
   private int due_amount;
   @Column(name = "amount_paid")
   private int amount_paid;
   @Column(name = "payment_status")
   private String payment_status;
   @Column(name = "paid_by")
   private String paid_by;
   @Column(name = "user_id")
   private String user_id;
   @Column(name = "update_at")
   private Timestamp update_at;
   @Column(name = "create_at")
   private Timestamp create_at;
   @Column(name = "booking_id")
   private int booking_id;
   @Column(name = "wallet")
   private int wallet;

}
