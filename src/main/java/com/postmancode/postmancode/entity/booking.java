package com.postmancode.postmancode.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "booking")
@Data
public class booking implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="booking_id")
    private int booking_id;
    @Column(name = "duration")
    private int duration;
    @Column(name = "status")
    private String status;
    @Column(name = "slot_id")
    private int slot_id;
    @Column(name = "user_id")
    private String user_id;
    @Column(name = "update_at")
    private Timestamp update_at;
    @Column(name = "create_at")
    private Timestamp create_at;
}
