package com.postmancode.postmancode;


import com.postmancode.postmancode.service.FreeSlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class FreeSlotController
{
    @Autowired
    public FreeSlotService serv;

    @PostMapping("/FreeSlot/{slotId}/{parkingId}")
    public void slotStatus(@RequestBody )
    {

    }
}
