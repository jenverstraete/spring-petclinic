package viverit.vivpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import viverit.vivpetclinic.model.PetType;
import viverit.vivpetclinic.repositories.PetTypeRepository;
import viverit.vivpetclinic.services.PetTypeService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetTypeSDJpaService implements PetTypeService {
    private final PetTypeRepository petTypeRepository;

    public PetTypeSDJpaService(final PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findById(final Long id) {
        return petTypeRepository.findById(id).orElse(null);
    }

    @Override
    public PetType save(final PetType object) {
        return petTypeRepository.save(object);
    }

    @Override
    public void delete(final PetType object) {
        petTypeRepository.delete(object);
    }

    @Override
    public void deleteById(final Long id) {
        petTypeRepository.deleteById(id);
    }
}
