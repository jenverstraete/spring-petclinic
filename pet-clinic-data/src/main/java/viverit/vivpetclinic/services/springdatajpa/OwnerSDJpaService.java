package viverit.vivpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import viverit.vivpetclinic.model.Owner;
import viverit.vivpetclinic.repositories.OwnerRepository;
import viverit.vivpetclinic.repositories.PetRepository;
import viverit.vivpetclinic.repositories.PetTypeRepository;
import viverit.vivpetclinic.services.OwnerService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Profile(("springdatajpa"))
public class OwnerSDJpaService implements OwnerService {
    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public OwnerSDJpaService(final OwnerRepository ownerRepository,
                             final PetRepository petRepository,
                             final PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Owner findByLastName(final String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public List<Owner> findAllByLastNameLike(final String lastName) {
        return ownerRepository.findAllByLastNameLike(lastName);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(final Long id) {
        return ownerRepository.findById(id).orElse(null);
    }

    @Override
    public Owner save(final Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(final Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(final Long id) {
        ownerRepository.deleteById(id);
    }
}
