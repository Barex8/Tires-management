package com.neumaticos.sandro.backend_tire_management.repository;


import java.sql.Timestamp;
import java.util.Date;
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

    @Transactional
    public List<Registry> findByTireSize(String tireSize) {
        return (List<Registry>) repository.findByTireSize(tireSize);
    }

    @Transactional
    public List<Registry> findBetweenDates(String date1, String date2) {
        return (List<Registry>) repository.findBetweenDates(date1,date2);
    }

    @Transactional
    public Registry save(Registry registry) {

        java.util.Date date = new Date();
        Timestamp timestamp = new java.sql.Timestamp(date.getTime());
        registry.setDate(timestamp);

        return repository.save(registry);
    }

    
}
