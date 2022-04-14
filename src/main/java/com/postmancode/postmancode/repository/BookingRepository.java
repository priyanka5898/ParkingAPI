package com.postmancode.postmancode.repository;

import com.postmancode.postmancode.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;



public interface BookingRepository  extends JpaRepository<Booking, Integer>
{
}

