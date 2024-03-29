package com.postmancode.postmancode.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "parking")
@Data
public class Parking implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="parking_id")
    private int parking_id;

    @Column(name="name")
    private String name;

    @Column(name = "area")
    private String area;

    @Column(name = "locality")
    private String locality;

    @Column(name = "pincode")
    private int pincode;

    @Column(name="charge")
    private int charge;

    @UpdateTimestamp
    @Column(name = "updated_at", columnDefinition = "TIMESTAMP")
    private LocalDateTime updated_at;

    @CreationTimestamp
    @Column(name = "created_at", columnDefinition = "TIMESTAMP")
    private LocalDateTime created_at;
}
