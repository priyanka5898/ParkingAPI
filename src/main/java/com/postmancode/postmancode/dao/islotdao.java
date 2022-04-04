package com.postmancode.postmancode.dao;

import com.postmancode.postmancode.entity.slot;

import java.util.List;

public interface islotdao
{
    List<slot> getslots();
    slot getslot(int slot_id);
    slot chooseslot(int parking_id, int slot_id);
    slot updateslot(String slot_number, String slot_status);
    slot deleteslot(int slot_id);

}
