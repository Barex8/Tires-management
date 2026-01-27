package com.neumaticos.sandro.backend_tire_management.repository;


import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Optional;

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

    @Transactional
    public Optional<Registry> update(long id, Registry registry) {
        Optional<Registry> registryOptional = repository.findById(id);
        if (registryOptional.isPresent()) {
            Registry registryDb = registryOptional.orElseThrow();
            registryDb.setClient_name(registry.getClient_name());
            registryDb.setClient_number(registry.getClient_number());
            registryDb.setDate(registry.getDate());
            registryDb.setDeposit(registry.getDeposit());
            registryDb.setNote(registry.getNote());
            registryDb.setPerson_order(registry.getPerson_order());
            registryDb.setProvider(registry.getProvider());
            registryDb.setState(registry.getState());
            registryDb.setTarget(registry.getTarget());
            registryDb.setTire_model(registry.getTire_model());
            registryDb.setTire_size(registry.getTire_size());

            return Optional.of(repository.save(registryDb));
        }
            return registryOptional;
    }

    @Override
    public Registry setRegistryNotifiedClient(long id) {
     
            Optional<Registry> registryDb = repository.findById(id);
            if (registryDb.isPresent()) {
                    Registry newRegistry = registryDb.get();
                    newRegistry.setState(1);
                    
                    return update(id,newRegistry).get();
                
            }
            // System.out.println("---------------- EXCEPTION HAS OCCURS -------------");
            // System.out.println("RegistryServiceImpl -> setRegistryNotifiedClient // error log: "+e.getLocalizedMessage());
        return null;
    }

    

    
}
