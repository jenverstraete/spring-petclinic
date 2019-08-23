package viverit.vivpetclinic.services;

import viverit.vivpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
