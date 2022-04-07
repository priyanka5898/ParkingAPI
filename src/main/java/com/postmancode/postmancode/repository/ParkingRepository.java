package com.postmancode.postmancode.repository;

import com.postmancode.postmancode.entity.Parking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingRepository extends JpaRepository<Parking, Integer> {
}
