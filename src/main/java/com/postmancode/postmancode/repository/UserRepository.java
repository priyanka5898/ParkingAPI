package com.postmancode.postmancode.repository;


import com.postmancode.postmancode.entity.UserParking;

import java.util.List;

public interface UserRepository
{
 List<UserParking> getuser();
 UserParking loginaccount(int user_id, String user_password);
 UserParking createaccount(String user_name, String user_contact, String user_email, String user_password);
 UserParking logoutaccount(String user_password, String user_name);
 UserParking updateinfo(String user_contact, String user_email, String user_password);

}
