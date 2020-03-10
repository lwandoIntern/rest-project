package za.ac.itnaledi.restproject.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.itnaledi.restproject.domain.Person;
import za.ac.itnaledi.restproject.repository.PersonRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public List<Person> getPeople(){
        List people = new ArrayList();
        this.personRepository.findAll().forEach(people::add);

        return people;
    }

    public Person getPerson(Long id){
        return this.personRepository.findById(id).get();
    }

    public void addPerson(Person person){
        this.personRepository.save(person);
    }

    public void updatePerson(Long id, Person person){
        this.personRepository.save(person);
    }

    public void deletePerson(Long id){
        this.personRepository.deleteById(id);
    }
}
