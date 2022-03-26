package com.postmancode.postmancode;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class Person
{
    private int id;
    private String name;
    private int age;

}
