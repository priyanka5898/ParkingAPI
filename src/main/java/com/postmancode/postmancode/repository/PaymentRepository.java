package com.postmancode.postmancode.repository;

import com.postmancode.postmancode.entity.Payment;

import java.util.List;

public interface PaymentRepository
{
    List<Payment> getpayments();
    Payment getpayment(int pay_id);
    Payment payamount(int due_amount);
    Payment updatepayment(int amount_paid, String paid_by);
    Payment getstatus(String payment_status);
    Payment redeemwallet(int wallet);

}
