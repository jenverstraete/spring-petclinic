package viverit.vivpetclinic.services.map;

import viverit.vivpetclinic.model.Pet;
import viverit.vivpetclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(final Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(final Pet owner) {
        super.delete(owner);
    }

    @Override
    public Pet save(final Pet owner) {
        return super.save(owner.getId(), owner);
    }
}
