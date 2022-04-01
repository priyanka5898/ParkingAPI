package com.postmancode.postmancode.dao;

import com.postmancode.postmancode.entity.parking;

import java.util.List;

public interface iparkingdao
{
    List<parking> getparkings();
    parking getparking(int parking_id);
    parking searchparking(String area,String locality,int pincode);
    parking updateparking(int parking_id);
    parking deleteparking(int parking_id);
}
