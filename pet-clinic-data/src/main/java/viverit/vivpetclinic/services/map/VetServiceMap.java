package viverit.vivpetclinic.services.map;

import org.springframework.stereotype.Service;
import viverit.vivpetclinic.model.Specialty;
import viverit.vivpetclinic.model.Vet;
import viverit.vivpetclinic.services.SpecialtyService;
import viverit.vivpetclinic.services.VetService;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    private final SpecialtyService specialtyService;

    public VetServiceMap(final SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

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
        if (owner.getSpecialties().size() > 0) {
            owner.getSpecialties().forEach(specialty ->
            {
                if (specialty.getId() == null) {
                    Specialty savedSpeciality = specialtyService.save(specialty);
                    specialty.setId(savedSpeciality.getId());
                }
            });
        }
        return super.save(owner);
    }
}
