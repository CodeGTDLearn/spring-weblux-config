package com.config.demo;

import com.config.demo.core.CoreConfigBean;
import com.config.demo.core.MergedConfigs;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Api {

  public static void main(String[] args) {

    var container =
         new AnnotationConfigApplicationContext(MergedConfigs.class);

    CoreConfigBean bean =
         container.getBean(CoreConfigBean.class);

    bean.printObjects();
  }

}