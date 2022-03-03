package com.config.demo;

import com.config.demo.core.ExampleBean;
import com.config.demo.core.ImportBeansConfig;
import com.config.demo.core.SampleBean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Api {

  public static void main(String[] args) {
    //		SpringApplication.run(Api.class, args);
    ApplicationContext ctxt =
         new AnnotationConfigApplicationContext(ImportBeansConfig.class);
    ExampleBean exampleBean = ctxt.getBean(ExampleBean.class);
    SampleBean sampleBean = ctxt.getBean(SampleBean.class);

    exampleBean.printObjects();
    sampleBean.printObjects();
  }

}