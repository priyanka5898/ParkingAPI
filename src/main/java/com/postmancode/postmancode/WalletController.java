package com.postmancode.postmancode;

import com.postmancode.postmancode.entity.Booking;
import com.postmancode.postmancode.entity.Wallet;
import com.postmancode.postmancode.service.BookingService;
import com.postmancode.postmancode.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/UserWallet/{userId}")
    public Wallet getWalletwithuserId(@PathVariable Integer userId){return wservice.getByUserId(userId);}

    @DeleteMapping("/Wallet/balance")
    public void deleteParkingwithId(@PathVariable Integer balance) {
        wservice.delete(balance);
    }
}
