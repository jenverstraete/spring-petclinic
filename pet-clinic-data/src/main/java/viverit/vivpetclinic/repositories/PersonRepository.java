package viverit.vivpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import viverit.vivpetclinic.model.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
