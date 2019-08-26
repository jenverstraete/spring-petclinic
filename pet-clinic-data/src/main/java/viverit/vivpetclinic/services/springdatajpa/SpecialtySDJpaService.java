package viverit.vivpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import viverit.vivpetclinic.model.Specialty;
import viverit.vivpetclinic.repositories.SpecialtyRepository;
import viverit.vivpetclinic.services.SpecialtyService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialtySDJpaService implements SpecialtyService {
    private final SpecialtyRepository specialtyRepository;

    public SpecialtySDJpaService(final SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Set<Specialty> findAll() {
        Set<Specialty> specialties = new HashSet<>();
        specialtyRepository.findAll().forEach(specialties::add);
        return specialties;
    }

    @Override
    public Specialty findById(final Long aLong) {
        return specialtyRepository.findById(aLong).orElse(null);
    }

    @Override
    public Specialty save(final Specialty object) {
        return specialtyRepository.save(object);
    }

    @Override
    public void delete(final Specialty object) {
        specialtyRepository.delete(object);
    }

    @Override
    public void deleteById(final Long aLong) {
        specialtyRepository.deleteById(aLong);
    }
}
