package com.neumaticos.sandro.backend_tire_management.repository;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link RegistryServiceImpl}.
 */
@Generated
public class RegistryServiceImpl__BeanDefinitions {
  /**
   * Get the bean definition for 'registryServiceImpl'.
   */
  public static BeanDefinition getRegistryServiceImplBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RegistryServiceImpl.class);
    InstanceSupplier<RegistryServiceImpl> instanceSupplier = InstanceSupplier.using(RegistryServiceImpl::new);
    instanceSupplier = instanceSupplier.andThen(RegistryServiceImpl__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
