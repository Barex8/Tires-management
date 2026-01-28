package com.neumaticos.sandro.backend_tire_management.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neumaticos.sandro.backend_tire_management.entities.Registry;
import com.neumaticos.sandro.backend_tire_management.services.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin(origins="http://localhost:4200",originPatterns="*")
@RequestMapping("/")
public class RegistryController {

    @Autowired
    private RegistryService registryService;

    @GetMapping
    public List<Registry> findAll(){
        return registryService.findAll();
    }

    @GetMapping("/{tireSize}")
    public List<Registry> findByTireSize(@PathVariable String tireSize){
        return registryService.findByTireSize(tireSize);
    }

    @PutMapping("/notified/{id}")
    public Registry setRegistryNotifiedClient(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.CREATED).body(registryService.setRegistryNotifiedClient(id)).getBody();
    }

    @PostMapping()
    public ResponseEntity<?> create(@RequestBody Registry registry) {
        //Falta validación
        return ResponseEntity.status(HttpStatus.CREATED).body(registryService.save(registry));

    }
    
}
