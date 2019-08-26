package viverit.vivpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import viverit.vivpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
