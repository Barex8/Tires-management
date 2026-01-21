package com.neumaticos.sandro.backend_tire_management.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neumaticos.sandro.backend_tire_management.entities.Registry;
import com.neumaticos.sandro.backend_tire_management.services.*;;

@RestController
@CrossOrigin(origins="http://localhost:4200",originPatterns="*")
@RequestMapping("/")
public class RegistryController {

    @Autowired
    private RegistryService registryService;

    @GetMapping
    public List<Registry> list(){
        return registryService.findAll();
    }
}
