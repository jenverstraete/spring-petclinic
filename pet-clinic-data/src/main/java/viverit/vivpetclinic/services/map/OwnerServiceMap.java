package viverit.vivpetclinic.services.map;

import org.springframework.stereotype.Service;
import viverit.vivpetclinic.model.Owner;
import viverit.vivpetclinic.services.OwnerService;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(final Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(final Owner owner) {
        super.delete(owner);
    }

    @Override
    public Owner save(final Owner owner) {
        return super.save(owner);
    }

    @Override
    public Owner findByLastName(final String lastName) {
        return null;
    }
}
