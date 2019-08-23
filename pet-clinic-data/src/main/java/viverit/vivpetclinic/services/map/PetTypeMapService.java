package viverit.vivpetclinic.services.map;

import org.springframework.stereotype.Service;
import viverit.vivpetclinic.model.PetType;
import viverit.vivpetclinic.services.PetTypeService;

import java.util.Set;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(final Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(final PetType object) {
        super.delete(object);
    }

    @Override
    public PetType save(final PetType object) {
        return super.save(object);
    }

    @Override
    public PetType findById(final Long id) {
        return super.findById(id);
    }
}
