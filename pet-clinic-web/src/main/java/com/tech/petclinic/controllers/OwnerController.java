package com.tech.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {


    @RequestMapping({"/owners","/owners/index","/owner/index.html"})
    public String listOwner(){
        return "owners/index";
    }

}
