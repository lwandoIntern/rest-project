package za.ac.itnaledi.restproject.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.itnaledi.restproject.domain.Person;
import za.ac.itnaledi.restproject.service.PersonService;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/getAll")
    public List getPeople(){
        return this.personService.getPeople();
    }

    @PostMapping("/add")
    public void addPerson(@RequestBody Person person){
        this.personService.addPerson(person);
    }

    @GetMapping("/get/{id}")
    public void getPerson(@PathVariable("id") Long id){
        this.personService.getPerson(id);
    }

    @PutMapping("/update/{id}")
    public void updatePerson(@PathVariable("id") Long id, @RequestBody Person person){
        this.personService.updatePerson(id,person);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePerson(@PathVariable("id") Long id){
        this.personService.deletePerson(id);
    }
}
