package com.postmancode.postmancode.repository;


import com.postmancode.postmancode.entity.Slot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SlotRepository  extends JpaRepository<Slot, Integer>
{
   List<Slot> findByParkingId(Integer parkingId);
   Slot findByNumberAndParkingId(Integer slotId, Integer parkingId);

}
