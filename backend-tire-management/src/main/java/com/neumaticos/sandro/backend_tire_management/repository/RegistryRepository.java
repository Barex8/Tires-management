package com.neumaticos.sandro.backend_tire_management.repository;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.neumaticos.sandro.backend_tire_management.entities.Registry;

public interface RegistryRepository extends CrudRepository<Registry, Long> {

    
    @Query("select r from Registry r where r.tire_size like ?1 and r.state = 0")
    List<Registry> findByTireSizeAndOpenState(String tireSize);
    
    @Query("select r from Registry r where r.tire_size like ?1")
    List<Registry> findByTireSize(String tireSize);
    
    @Query("select r from Registry r where r.date between ?1 and ?2")
    List<Registry> findBetweenDates(String date1, String date2);
    
    @Query("select r from Registry r where r.id = id")
    Registry setRegistryNotifiedClient(Long id);

    @Query("SELECT r FROM Registry r ORDER BY CASE WHEN r.state IN (0, 1) THEN 0 ELSE 1 END, r.date DESC LIMIT 50 OFFSET 0 ")
    List<Registry> findAllOrdered();

}
