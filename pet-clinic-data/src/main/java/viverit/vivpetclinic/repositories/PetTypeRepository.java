package viverit.vivpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import viverit.vivpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
