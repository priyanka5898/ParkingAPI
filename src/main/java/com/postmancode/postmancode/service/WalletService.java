package com.postmancode.postmancode.service;

import com.postmancode.postmancode.entity.Wallet;
import com.postmancode.postmancode.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class WalletService
{
    @Autowired
    private WalletRepository wallet;

    public List<Wallet> listAll(){
        return wallet.findAll();
    }
    public void save(Wallet wal)
    {
        wallet.save(wal);
    }
    public  Wallet get(Integer id)
    {
        return wallet.getById(id);
    }
    public void delete(Integer id)
    {
        wallet.deleteById(id);
    }
    public Optional<Wallet> getByUserId(Integer id)
    {
        return wallet.findByUserId(id);
    }

}
