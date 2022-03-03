package com.config.demo.birds.core;

import com.config.demo.birds.models.Eagle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EagleConfig {
  @Bean
  public Eagle eagle() {

    return new Eagle();
  }
}