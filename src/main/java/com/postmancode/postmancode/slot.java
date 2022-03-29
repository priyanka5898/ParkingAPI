package com.postmancode.postmancode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class slot
{
    private int slotid;
    private String slot_number;
    private String Slot_Status;
    private String userid;
    private String update_attimestamp;
    private String create_attimestamp;

}
