package viverit.vivpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import viverit.vivpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
