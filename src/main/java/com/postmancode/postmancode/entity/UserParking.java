package com.postmancode.postmancode.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "user_parking")
@Data
public class UserParking implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "user_id")
    private int user_id;
    @Column(name = "user_name")
    private String user_name;
    @Column(name = "user_contact")
    private int user_contact;
    @Column(name = "user_email")
    private String user_email;
    @Column(name = "user_password")
    private String user_password;
    @Column(name = "update_at", columnDefinition = "TIMESTAMP")
    private Timestamp update_at;
    @Column(name = "create_at", columnDefinition = "TIMESTAMP")
    private Timestamp create_at;
}
