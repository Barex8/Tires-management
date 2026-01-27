package com.neumaticos.sandro.backend_tire_management.controllers;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link RegistryController}.
 */
@Generated
public class RegistryController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static RegistryController apply(RegisteredBean registeredBean,
      RegistryController instance) {
    AutowiredFieldValueResolver.forRequiredField("registryService").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
