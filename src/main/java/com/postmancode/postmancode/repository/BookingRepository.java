package com.postmancode.postmancode.repository;

import com.postmancode.postmancode.entity.Booking;

import java.util.List;

public interface BookingRepository
{
  List<Booking> getbookings();
  Booking getbooking(int booking_id);
  Booking getduration(int duration);
  Booking updatebooking(int booking_id, int duration);
  Booking deletebooking(int booking_id);
}

