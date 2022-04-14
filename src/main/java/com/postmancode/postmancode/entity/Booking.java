package com.postmancode.postmancode.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "booking")
@Data
public class Booking implements Serializable
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


    @UpdateTimestamp
    @Column(name = "updated_at", columnDefinition = "TIMESTAMP")
    private Timestamp update_at;


    @CreationTimestamp
    @Column(name = "create_at", columnDefinition = "TIMESTAMP")
    private Timestamp create_at;
}
