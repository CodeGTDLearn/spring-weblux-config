package com.config.demo.core;

import com.config.demo.birds.core.BirdConfig;
import com.config.demo.fish.config.FishConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({FishConfig.class, BirdConfig.class})
public class ImportBeansConfig {

  @Bean
  public ExampleBean exampleBean() {
    return new ExampleBean();
  }
  
  @Bean
  public SampleBean sampleBean() {
    return new SampleBean();
  }
}