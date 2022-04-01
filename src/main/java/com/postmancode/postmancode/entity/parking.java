package com.postmancode.postmancode.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;

@Entity
@Table(name = "parking")
@Data
public class parking implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="parking_id")
    private int parking_id;

    @Column(name = "area")
    private String area;

    @Column(name = "locality")
    private String locality;

    @Column(name = "pincode")
    private int pincode;

    @Convert(converter = LocalDateTimeConverter.class)
    @Column(name = "updated_at")
    private LocalDateTime updated_at;

    @Convert(converter = LocalDateTimeConverter.class)
    @Column(name = "created_at")
    private LocalDateTime created_at;
}
