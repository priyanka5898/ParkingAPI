package com.postmancode.postmancode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class payment
{
   private int pay_id;
   private int due_amount;
   private int amount_paid;
   private String payment_status;
   private String paid_by;
   private String user_id;
   private String update_attimestamp;
   private String create_attimestamp;
   private int bookingid;
   private int wallet;

}
