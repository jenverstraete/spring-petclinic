package viverit.vivpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import viverit.vivpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
