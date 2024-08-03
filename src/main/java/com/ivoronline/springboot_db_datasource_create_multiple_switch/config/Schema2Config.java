package com.ivoronline.springboot_db_datasource_create_multiple_switch.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import javax.sql.DataSource;

@Configuration
public class Schema2Config {

  //=========================================================================================================
  // DATA SOURCE PROPERTIES
  //=========================================================================================================
  @Bean
  @ConfigurationProperties("schema2.spring.datasource")
  public DataSourceProperties schema2DataSourceProperties() {
    return new DataSourceProperties();
  }
  
  //=========================================================================================================
  // DATA SOURCE
  //=========================================================================================================
  @Bean
  //@Primary
  public DataSource schema2DataSource() {
    return schema2DataSourceProperties().initializeDataSourceBuilder().build();
  }

}
