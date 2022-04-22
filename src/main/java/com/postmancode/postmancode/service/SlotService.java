package com.postmancode.postmancode.service;

import com.postmancode.postmancode.entity.Slot;
import com.postmancode.postmancode.repository.SlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SlotService
{
    @Autowired
    private SlotRepository srepo;

    public List<Slot> listAll()
    {
        return srepo.findAll();
    }

    public void save(Slot slot)
    {
        srepo.save(slot);
    }
    public Slot get(Integer Id)
    {
        return srepo.getById(Id);
    }
    public void delete(Integer Id)
    {
        srepo.deleteById(Id);
    }
    public List<Slot> listAllSlots(Integer parkingId)
    {
        return srepo.findByParkingId(parkingId);
    }


}
