package com.postmancode.postmancode;

import com.postmancode.postmancode.entity.Payment;
import com.postmancode.postmancode.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaymentController
{
    @Autowired
    private PaymentService payserve;

    @GetMapping("/Payment")
    public List<Payment> getallpayments(){return payserve.listAll();}

    @GetMapping("/Payment/{PaymentId}")
    public Payment getpaymentwithId(@PathVariable Integer Payment){return payserve.get(Payment);}

    @PostMapping("/Payment/newPayment")
    public void addpayment(@RequestBody Payment payment){payserve.save(payment);}


}
