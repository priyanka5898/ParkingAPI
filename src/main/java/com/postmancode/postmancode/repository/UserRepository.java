package com.postmancode.postmancode.repository;


import com.postmancode.postmancode.entity.Booking;
import com.postmancode.postmancode.entity.UserParking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserParking, Integer>
{


}
