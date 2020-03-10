package za.ac.itnaledi.restproject.repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.itnaledi.restproject.domain.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
