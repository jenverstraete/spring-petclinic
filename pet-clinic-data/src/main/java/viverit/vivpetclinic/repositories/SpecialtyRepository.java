package viverit.vivpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import viverit.vivpetclinic.model.Specialty;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
