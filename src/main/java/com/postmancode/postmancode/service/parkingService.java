package com.postmancode.postmancode.service;

import com.postmancode.postmancode.entity.parking;
import org.springframework.beans.factory.annotation.Autowired;
import com.postmancode.postmancode.dao.iparkingdao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class parkingService {

    @Autowired
    private iparkingdao dao;

    public List<parking> getParkings() {
        return dao.getparkings();
    }

}
