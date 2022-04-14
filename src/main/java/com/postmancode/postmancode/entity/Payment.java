package com.postmancode.postmancode.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "payment")
@Data
public class Payment implements Serializable
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
   @Column(name = "booking_id")
   private int booking_id;
   @Column(name = "wallet")
   private int wallet;

   @UpdateTimestamp
   @Column(name = "update_at", columnDefinition = "TIMESTAMP")
   private Timestamp update_at;

   @CreationTimestamp
   @Column(name = "create_at", columnDefinition = "TIMESTAMP")
   private Timestamp create_at;
}
