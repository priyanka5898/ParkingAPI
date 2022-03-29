package com.postmancode.postmancode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class booking
{
    private int bookingid;
    private int duration;
    private String status;
    private int slotid;
    private String userid;
    private String update_attimestamp;
    private String create_attimestamp;
}
