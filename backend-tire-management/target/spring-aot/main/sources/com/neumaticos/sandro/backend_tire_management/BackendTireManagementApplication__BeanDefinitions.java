package com.neumaticos.sandro.backend_tire_management;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link BackendTireManagementApplication}.
 */
@Generated
public class BackendTireManagementApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'backendTireManagementApplication'.
   */
  public static BeanDefinition getBackendTireManagementApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(BackendTireManagementApplication.class);
    beanDefinition.setInstanceSupplier(BackendTireManagementApplication::new);
    return beanDefinition;
  }
}
