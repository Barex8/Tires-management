package com.neumaticos.sandro.backend_tire_management.repository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neumaticos.sandro.backend_tire_management.entities.Registry;
import com.neumaticos.sandro.backend_tire_management.services.RegistryService;

import jakarta.transaction.Transactional;

@Service
public class RegistryServiceImpl implements RegistryService {

    @Autowired
    private RegistryRepository repository;

    @Transactional
    public List<Registry> findAll() {
        return (List<Registry>) repository.findAll();
    }
}
