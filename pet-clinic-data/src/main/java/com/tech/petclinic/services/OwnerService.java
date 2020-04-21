package com.tech.petclinic.services;

import com.tech.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner finById(Long id);
    Owner save(Owner owner);
    Owner findByLastName(String lastName);
    Set<Owner> findAll();
}
