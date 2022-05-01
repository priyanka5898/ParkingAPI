package com.postmancode.postmancode;

import com.postmancode.postmancode.entity.Slot;
import com.postmancode.postmancode.service.SlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SlotController
{
    @Autowired
    private SlotService service;

    @GetMapping("/Slot")
    public List<Slot> getallslots(){return service.listAll();}

    @GetMapping("/Slot/{Slotid}")
    public Slot getUserwithId(@PathVariable Integer Slotid){return service.get(Slotid);}

    @PostMapping("/Slot/Slot")
    public void addSlot(@RequestBody Slot Slot){service.save(Slot);}

    @GetMapping("/ParkingSlots/{ParkingId}")
    public List<Slot> getParkingSlots(@PathVariable Integer ParkingId){return service.listAllSlots(ParkingId);}
}
