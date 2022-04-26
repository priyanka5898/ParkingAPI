package com.postmancode.postmancode;

import com.postmancode.postmancode.dto.BookingDto;
import com.postmancode.postmancode.entity.Booking;
import com.postmancode.postmancode.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookingController
{
    @Autowired
    private BookingService service;

    @GetMapping("/Booking")
    public List<Booking> getallBookings(){return service.listAll();}

    @GetMapping("/Booking/{BookingId}")
    public Booking getBookingwithId(@PathVariable Integer BookingId){return service.get(BookingId);}

    @PostMapping ("/Booking/NewBooking")
    public void addBooking(@RequestBody Booking booking)
    {
        service.save(booking);
    }

    @PostMapping ("/Booking/ConfirmBooking")
    public ResponseEntity<String> confirmBooking(@RequestBody BookingDto booking)
    {
        if(service.confirmBooking(booking))
            return  ResponseEntity.status(HttpStatus.OK).body("Booking Confirmed");

        return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("Booking Failed");
    }



}
