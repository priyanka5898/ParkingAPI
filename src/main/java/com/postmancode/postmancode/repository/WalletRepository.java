package com.postmancode.postmancode.repository;


import com.postmancode.postmancode.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WalletRepository extends JpaRepository<Wallet, Integer>
{
    Optional<Wallet> findByUserId(Integer id);
}
