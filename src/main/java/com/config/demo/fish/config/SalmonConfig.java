package com.config.demo.fish.config;

import com.config.demo.fish.models.Salmon;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SalmonConfig {
  @Bean
  public Salmon salmon() {

    return new Salmon();
  }
}