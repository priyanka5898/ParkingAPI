package com.postmancode.postmancode.dao;


import com.postmancode.postmancode.entity.user_parking;

import java.util.List;

public interface iuserdao
{
 List<user_parking> getuser();
 user_parking loginaccount(int user_id,String user_password);
 user_parking createaccount(String user_name,String user_contact,String user_email,String user_password);
 user_parking logoutaccount(String user_password, String user_name);
 user_parking updateinfo(String user_contact,String user_email,String user_password);

}
