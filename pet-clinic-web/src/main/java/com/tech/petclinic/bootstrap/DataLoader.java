package com.tech.petclinic.bootstrap;

import com.tech.petclinic.model.Owner;
import com.tech.petclinic.model.Vet;
import com.tech.petclinic.services.OwnerService;
import com.tech.petclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("oqi");
        owner2.setLastName("faruoqi");
        ownerService.save(owner2);

        System.out.println("--- Loaded Owner ---");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Paul");
        vet1.setLastName("Blade");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Robin");
        vet2.setLastName("Wright");
        vetService.save(vet2);

        System.out.println("-- Loaded Vet ---");



    }
}
