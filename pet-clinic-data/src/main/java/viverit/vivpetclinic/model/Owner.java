package viverit.vivpetclinic.model;

import java.util.Set;

public class Owner extends Person{
    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(final Set<Pet> pets) {
        this.pets = pets;
    }
}
