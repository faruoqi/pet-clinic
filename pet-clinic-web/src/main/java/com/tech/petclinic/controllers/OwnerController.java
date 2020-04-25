package com.tech.petclinic.controllers;

import com.tech.petclinic.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    private final OwnerService ownerService;

    @Autowired
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }
    

    @RequestMapping({"/owners","/owners/index","/owner/index.html"})
    public String listOwner(Model model){
        model.addAttribute("owners",ownerService.findAll());
        return "owners/index";
    }

}
