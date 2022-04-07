package com.postmancode.postmancode;


import com.postmancode.postmancode.entity.parking;
import com.postmancode.postmancode.service.parkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("parking")
public class ParkingController {

    @Autowired
    private parkingService service;

    @GetMapping("/")
    public ResponseEntity<List<parking>> getParkings(){

        List<parking> books = service.getParkings();
        return new ResponseEntity<List<parking>>(books, HttpStatus.OK);

    }
}
