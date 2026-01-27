package com.neumaticos.sandro.backend_tire_management.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.neumaticos.sandro.backend_tire_management.entities.Registry;

@Service
public interface RegistryService {

    List<Registry> findAll();
    List<Registry> findByTireSize(String tireSize);
    List<Registry> findBetweenDates(String date1, String date2);


    Registry save (Registry registry);
}
