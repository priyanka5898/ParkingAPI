package com.postmancode.postmancode.service;

import com.postmancode.postmancode.entity.Booking;
import com.postmancode.postmancode.entity.Parking;
import com.postmancode.postmancode.repository.BookingRepository;
import com.postmancode.postmancode.repository.ParkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ParkingService
{
    @Autowired
    private ParkingRepository park;

    public List<Parking> listAll(){
        return park.findAll();
    }
    public void save(Parking parking)
    {
        park.save(parking);
    }
    public  Parking get(Integer id)
    {
        return park.getById(id);
    }
    public void delete(Integer id)
    {
        park.deleteById(id);
    }
}
