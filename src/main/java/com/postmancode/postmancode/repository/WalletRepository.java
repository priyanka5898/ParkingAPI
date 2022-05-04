package com.postmancode.postmancode.repository;


import com.postmancode.postmancode.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet, Integer>
{
    Wallet findByUserId(Integer id);
}
