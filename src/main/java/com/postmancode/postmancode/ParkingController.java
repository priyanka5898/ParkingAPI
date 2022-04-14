package com.postmancode.postmancode;



import com.postmancode.postmancode.entity.Parking;

import com.postmancode.postmancode.service.ParkingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
//@RequestMapping("parking")
//public class ParkingController {

  //  @Autowired
    //private parkingService service;

    //@GetMapping("/")
    //public ResponseEntity<List<parking>> getParkings(){

       // List<parking> books = service.getParkings();
        //return new ResponseEntity<List<parking>>(books, HttpStatus.OK);

//=======
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
