package com.tech.petclinic.controllers;

import com.tech.petclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetService vetService;

    @Autowired
    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets","/vets/index.html","/vets/index"})
    public String listVets(Model model){
        model.addAttribute("vets",vetService.findAll());
        System.out.println(vetService.findById(1L).getFirstName());
        return "vets/index";
    }

}
