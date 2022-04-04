package com.postmancode.postmancode.dao;

import com.postmancode.postmancode.entity.payment;

import java.util.List;

public interface ipaymentdao
{
    List<payment> getpayments();
    payment getpayment(int pay_id);
    payment payamount(int due_amount);
    payment updatepayment(int amount_paid,String paid_by);
    payment getstatus(String payment_status);
    payment redeemwallet(int wallet);

}
