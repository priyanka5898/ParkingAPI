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
    public Slot getUserwithId(@PathVariable Integer slotid){return service.get(slotid);}

    @PostMapping("/Slot/Slot")
    public void addSlot(@RequestBody Slot slot){service.save(slot);}

    @GetMapping("/ParkingSlots/{ParkingId}")
    public List<Slot> getParkingSlots(@PathVariable Integer parkingId){return service.listAllSlots(parkingId);}
}
