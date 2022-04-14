package com.postmancode.postmancode.service;

import com.postmancode.postmancode.entity.Parking;
import com.postmancode.postmancode.repository.ParkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ParkingService {
    
    @Autowired
    private ParkingRepository repo;

    public List<Parking> listAll() {
        return repo.findAll();
    }

    public void save(Parking parking) {
        repo.save(parking);
    }

    public Parking get(Integer id) {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
