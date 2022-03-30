package com.postmancode.postmancode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class user_parking
{
    private int user_id;
    private String user_name;
    private int user_contact;
    private String user_email;
    private String user_password;
    private String update_attimestamp;
    private String create_attimestamp;
}
