package com.postmancode.postmancode;

import com.postmancode.postmancode.entity.Booking;
import com.postmancode.postmancode.entity.Wallet;
import com.postmancode.postmancode.service.BookingService;
import com.postmancode.postmancode.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WalletController
{
    @Autowired
    private WalletService wservice;

    @GetMapping("/Wallet")
    public List<Wallet> getWallet(){return wservice.listAll();}

    @GetMapping("/Wallet/{WalletId}")
    public Wallet getWalletwithId(@PathVariable Integer WalletId){return wservice.get(WalletId);}

    @PostMapping("/Wallet/NewWallet")
    public void addWallet(@RequestBody Wallet wallet)
    {
        wservice.save(wallet);
    }
}