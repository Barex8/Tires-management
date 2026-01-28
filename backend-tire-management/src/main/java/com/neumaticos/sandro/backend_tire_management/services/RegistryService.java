package com.neumaticos.sandro.backend_tire_management.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.neumaticos.sandro.backend_tire_management.entities.Registry;

@Service
public interface RegistryService {

    List<Registry> findAllOrdered();
    List<Registry> findByTireSize(String tireSize);
    List<Registry> findBetweenDates(String date1, String date2);

    Registry setRegistryNotifiedClient(long id);

    Optional<Registry> update (long id, Registry registry);

    Registry save (Registry registry);
}
