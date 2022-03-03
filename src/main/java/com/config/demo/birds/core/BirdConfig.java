package com.config.demo.birds.core;

import com.config.demo.birds.models.Eagle;
import com.config.demo.birds.models.Ostrich;
import com.config.demo.birds.models.Peacock;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BirdConfig {

  @Bean
  public Eagle eagle() {
    return new Eagle();
  }
  
  @Bean
  public Ostrich ostrich() {
    return new Ostrich();
  }
  
  @Bean
  public Peacock peacock() {
    return new Peacock();
  }
}