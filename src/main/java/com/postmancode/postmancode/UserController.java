package com.postmancode.postmancode;

import com.postmancode.postmancode.entity.UserParking;
import com.postmancode.postmancode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController
{
   @Autowired
   private UserService service;

   @GetMapping("/UserParking")
    public List<UserParking> getAllBookings(){return service.ListAll();}

   @GetMapping("/UserParking/{UserId}")
    public Optional<UserParking> getUserwithId(@PathVariable Integer UserId){return service.get(UserId);}

    @PostMapping("/UserParking/User")
    public void addUser(@RequestBody UserParking user){service.save(user);}

    @GetMapping("/Login/{email}/{password}")
    public Optional<UserParking> getUserwithLogin(@PathVariable String email,@PathVariable String password)
    {return service.login(email,password);}
}
