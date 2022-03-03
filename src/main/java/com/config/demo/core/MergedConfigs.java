package com.config.demo.core;

import com.config.demo.birds.core.EagleConfig;
import com.config.demo.fish.config.SalmonConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/*╔═══════════════════════════════════════════════════════════════╗
  ║                      MERGER-CONFIG-CLASS                      ║
  ╠═══════════════════════════════════════════════════════════════╣
  ║ a) Use @Import, to bring the @Configuration-CLASSES to unify  ║
  ║ b) Create a central @Bean to be the "Unifier Bean"            ║
  ║ c) Use this "Unifier" as a "CENTRAL-BEAN"                     ║
  ╚═══════════════════════════════════════════════════════════════╝*/
@Configuration
@Import({SalmonConfig.class, EagleConfig.class})
public class MergedConfigs {

  @Bean
  public CoreConfigBean coreConfigBean() {

    return new CoreConfigBean();
  }
}