package com.neumaticos.sandro.backend_tire_management.repository;

import com.neumaticos.sandro.backend_tire_management.entities.Registry;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.lang.String;
import java.util.List;
import org.springframework.aot.generate.Generated;
import org.springframework.data.jpa.repository.aot.AotRepositoryFragmentSupport;
import org.springframework.data.jpa.repository.query.QueryEnhancerSelector;
import org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport;

/**
 * AOT generated JPA repository implementation for {@link RegistryRepository}.
 */
@Generated
public class RegistryRepositoryImpl__AotRepository extends AotRepositoryFragmentSupport {
  private final RepositoryFactoryBeanSupport.FragmentCreationContext context;

  private final EntityManager entityManager;

  public RegistryRepositoryImpl__AotRepository(EntityManager entityManager,
      RepositoryFactoryBeanSupport.FragmentCreationContext context) {
    super(QueryEnhancerSelector.DEFAULT_SELECTOR, context);
    this.entityManager = entityManager;
    this.context = context;
  }

  /**
   * AOT generated implementation of {@link RegistryRepository#findByTireSize(java.lang.String)}.
   */
  public List<Registry> findByTireSize(String tireSize) {
    String queryString = "select r from Registry r where r.tire_size like ?1";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter(1, tireSize);

    return (List<Registry>) query.getResultList();
  }
}
