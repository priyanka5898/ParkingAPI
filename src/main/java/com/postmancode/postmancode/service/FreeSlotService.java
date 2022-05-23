package com.postmancode.postmancode.service;

import com.postmancode.postmancode.entity.Slot;
import com.postmancode.postmancode.repository.SlotRepository;

public class FreeSlotService
{
    private SlotRepository srep;
    public Slot findByNo(String slotId, Integer parkingId)
    {
        return srep.findByNumberAndParkingId(slotId,parkingId);
    }
}
