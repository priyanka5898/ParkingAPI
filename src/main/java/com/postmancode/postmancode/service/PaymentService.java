package com.postmancode.postmancode.service;


import com.postmancode.postmancode.entity.Payment;
import com.postmancode.postmancode.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PaymentService
{
    @Autowired
    private PaymentRepository pay;

    public List<Payment> listAll(){
        return pay.findAll();
    }
    public void save(Payment payment)
    {
        pay.save(payment);
    }
    public  Payment get(Integer id)
    {
        return pay.getById(id);
    }
    public void delete(Integer id)
    {
        pay.deleteById(id);
    }

}
