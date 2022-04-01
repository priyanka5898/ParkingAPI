package com.postmancode.postmancode.dao;

import com.postmancode.postmancode.entity.booking;

import java.util.List;

public interface ibookingdao
{
  List<booking> getbookings();
  booking getbooking(int booking_id);
  booking getduration(int duration);
  booking updatebooking(int booking_id,int duration);
  booking deletebooking(int booking_id);
}

