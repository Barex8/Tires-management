package com.neumaticos.sandro.backend_tire_management.repository;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link RegistryServiceImpl}.
 */
@Generated
public class RegistryServiceImpl__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static RegistryServiceImpl apply(RegisteredBean registeredBean,
      RegistryServiceImpl instance) {
    AutowiredFieldValueResolver.forRequiredField("repository").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
