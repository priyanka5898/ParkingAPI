package com.postmancode.postmancode.repository;


import com.postmancode.postmancode.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository  extends JpaRepository<Payment, Integer>
{


}
