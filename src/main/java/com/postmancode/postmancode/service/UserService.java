package com.postmancode.postmancode.service;

import com.postmancode.postmancode.entity.UserParking;
import com.postmancode.postmancode.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService
{
    @Autowired
    private UserRepository user;

    public List<UserParking> ListAll()
    {
        return user.findAll();
    }

    public void save(UserParking userp)
    {
        user.save(userp);
    }

    public Optional<UserParking> get(Integer id)
    {
        return user.findById(id);
    }

    public void delete(Integer id)
    {
        user.deleteById(id);
    }


}
