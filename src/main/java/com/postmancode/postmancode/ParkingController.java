package com.postmancode.postmancode;

import com.postmancode.postmancode.entity.Parking;
import com.postmancode.postmancode.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ParkingController {
    @Autowired
    private ParkingService service;

    @GetMapping("/Parking")
    public List<Parking> getAllParkings() {
        return service.listAll();
    }

    @GetMapping("/Parking/{ParkingId}")
    public Parking getParkingWithID(@PathVariable Integer ParkingId) {
        return service.get(ParkingId);
    }

    @PostMapping("/Parking/newParking")
    public void addParking(@RequestBody Parking parking) {
         service.save(parking);
    }
}
