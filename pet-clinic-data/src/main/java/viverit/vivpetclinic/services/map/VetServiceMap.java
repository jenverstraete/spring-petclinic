package viverit.vivpetclinic.services.map;

import viverit.vivpetclinic.model.Vet;
import viverit.vivpetclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(final Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(final Vet owner) {
        super.delete(owner);
    }

    @Override
    public Vet save(final Vet owner) {
        return super.save(owner.getId(), owner);
    }
}
