package com.config.demo.fish.config;

import com.config.demo.fish.models.GoldFish;
import com.config.demo.fish.models.Guppy;
import com.config.demo.fish.models.Salmon;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FishConfig {

  @Bean
  public GoldFish goldFish() {
    return new GoldFish();
  }
  
  @Bean
  public Guppy guppy() {
    return new Guppy();
  }
  
  @Bean
  public Salmon salmon() {
    return new Salmon();
  }
  
}