package com.postmancode.postmancode;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.RequestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;
@RestController
public class PersonController
{
    @GetMapping("/person")
    public List<Person> getAllPersons(){
        List<Person> personlist= new ArrayList<Person>();
        personlist.add(new Person(1,"Tanvi G",21));
        personlist.add(new Person(2,"Vinaya B",19));
        personlist.add(new Person(3,"Pratik K",22));
        return personlist;
    }

    @GetMapping("/person/{personId}")
    public Person getPersonWithID(@PathVariable Integer personId)
    {
     return new Person(3,"Anisha Y",21);
    }

    @PostMapping("/person/newperson")
    public void addPerson(@RequestBody Person person)

    {
        System.out.println("Saving Person Information ");
    }

}
