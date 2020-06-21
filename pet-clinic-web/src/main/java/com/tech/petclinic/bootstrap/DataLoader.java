package com.tech.petclinic.bootstrap;

import com.tech.petclinic.model.Owner;
import com.tech.petclinic.model.PetType;
import com.tech.petclinic.model.Vet;
import com.tech.petclinic.services.OwnerService;
import com.tech.petclinic.services.PetTypeService;
import com.tech.petclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService,PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("cat");
        PetType savedCatPetType = petTypeService.save(cat);
        System.out.println("--- Loaded Pet Type ---");

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("oqi");
        owner2.setLastName("faruoqi");
        ownerService.save(owner2);

        System.out.println("--- Loaded Owner ---");

        Vet vet1 = new Vet();
        vet1.setFirstName("Paul");
        vet1.setLastName("Blade");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Robin");
        vet2.setLastName("Wright");
        vetService.save(vet2);

        System.out.println("-- Loaded Vet ---");



    }
}
