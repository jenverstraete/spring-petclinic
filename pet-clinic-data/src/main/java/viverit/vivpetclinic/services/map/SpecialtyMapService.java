package viverit.vivpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import viverit.vivpetclinic.model.Specialty;
import viverit.vivpetclinic.services.SpecialtyService;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class SpecialtyMapService extends AbstractMapService<Specialty, Long> implements SpecialtyService {
    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(final Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(final Specialty object) {
        super.delete(object);
    }

    @Override
    public Specialty save(final Specialty object) {
        return super.save(object);
    }

    @Override
    public Specialty findById(final Long id) {
        return super.findById(id);
    }
}
