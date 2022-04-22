package com.postmancode.postmancode.repository;


import com.postmancode.postmancode.entity.Booking;
import com.postmancode.postmancode.entity.UserParking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserParking, Integer>
{
   Optional<UserParking> findByEmailAndPassword(String email, String password);


}
