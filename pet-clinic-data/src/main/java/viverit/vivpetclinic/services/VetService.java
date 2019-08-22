package viverit.vivpetclinic.services;

import viverit.vivpetclinic.model.Vet;

import java.util.Set;

public interface VetService  {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}