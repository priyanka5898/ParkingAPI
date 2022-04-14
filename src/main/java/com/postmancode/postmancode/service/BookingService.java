package com.postmancode.postmancode.service;


import com.postmancode.postmancode.entity.Booking;
import com.postmancode.postmancode.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class BookingService
{
    @Autowired
    private BookingRepository book;

    public List<Booking> listAll(){
        return book.findAll();
    }
    public void save(Booking booking)
    {
        book.save(booking);
    }
    public  Booking get(Integer id)
    {
        return book.getById(id);
    }
    public void delete(Integer id)
    {
        book.deleteById(id);
    }

}
