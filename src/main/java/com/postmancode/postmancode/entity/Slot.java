package com.postmancode.postmancode.entity;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "slot")
@Data
public class Slot implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "slot_id")
    private int slot_id;
    @Column(name = "slot_number")
    private String slot_number;
    @Column(name = "slot_status")
    private String Slot_status;
    @Column(name = "user_id")
    private String user_id;
    @Column(name = "parking_id")
    private int parking_id;
    @Column(name = "update_at", columnDefinition = "TIMESTAMP")
    private Timestamp update_at;
    @Column(name = "create_at", columnDefinition = "TIMESTAMP")
    private Timestamp create_at;
}
