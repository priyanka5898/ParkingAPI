package com.postmancode.postmancode.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "user_parking")
@Data
public class user_parking implements Serializable
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
    @Column(name="update_at")
    private Timestamp update_at;
    @Column(name = "create_at")
    private Timestamp create_at;
}
