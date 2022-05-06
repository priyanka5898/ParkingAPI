package com.postmancode.postmancode.service;


import com.postmancode.postmancode.dto.BookingDto;
import com.postmancode.postmancode.entity.Booking;
import com.postmancode.postmancode.entity.Parking;
import com.postmancode.postmancode.entity.Slot;
import com.postmancode.postmancode.entity.Wallet;
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

    @Autowired
    private SlotService slotService;

    @Autowired
    private ParkingService parkingService;

    @Autowired
    private WalletService walletService;



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
    public Booking confirmBooking(BookingDto booking){

        Slot slot = slotService.findByNo(booking.getSlotId(),booking.getParkingId());
        Parking parking = parkingService.get(booking.getParkingId());
        Wallet wall = walletService.getByUserId(booking.getUserId());
        if(wall != null) {
            if(parking.getCharge() <= wall.getBalance()) {
                Booking b= new Booking();
                b.setSlotId(slot.getId());
                b.setUserId(booking.getUserId());
                b.setStatus("BOOKED");
                b.setDuration(1);
                save(b);
                wall.setBalance(wall.getBalance() - parking.getCharge());
                walletService.save(wall);
                slot.setStatus("BOOKED");
                slotService.save(slot);
                return b;
            }
            return null;
        }
         return null;

    }

}
