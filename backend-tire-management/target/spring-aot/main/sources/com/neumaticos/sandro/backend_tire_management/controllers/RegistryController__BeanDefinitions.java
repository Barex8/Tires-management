package com.neumaticos.sandro.backend_tire_management.controllers;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link RegistryController}.
 */
@Generated
public class RegistryController__BeanDefinitions {
  /**
   * Get the bean definition for 'registryController'.
   */
  public static BeanDefinition getRegistryControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RegistryController.class);
    InstanceSupplier<RegistryController> instanceSupplier = InstanceSupplier.using(RegistryController::new);
    instanceSupplier = instanceSupplier.andThen(RegistryController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
