package com.postmancode.postmancode.repository;

import com.postmancode.postmancode.entity.Slot;

import java.util.List;

public interface SlotRepository
{
    List<Slot> getslots();
    Slot getslot(int slot_id);
    Slot chooseslot(int parking_id, int slot_id);
    Slot updateslot(String slot_number, String slot_status);
    Slot deleteslot(int slot_id);

}
