package com.config.demo.core;

import com.config.demo.birds.models.Eagle;
import com.config.demo.fish.models.Salmon;
import org.springframework.beans.factory.annotation.Autowired;

public class CoreConfigBean {

  @Autowired
  private Salmon salmon;

  @Autowired
  private Eagle eagle;


  public void printObjects() {

    final String salmon = this.salmon.getClass()
                                     .getSimpleName();
    final String guppy = this.eagle.getClass()
                                   .getSimpleName();

    System.out.printf(
         "\n╔═════════════════════════════╗\n" +
              "║     %s    ║\n" +
              "╠═════════════════════════════╣\n" +
              "║ --> %s                  ║\n" +
              "║ --> %s                   ║\n" +
              "╚═════════════════════════════╝\n"
         ,
         "EXAMPLE-BEAN-OBJECTS", salmon, guppy
                     );
  }
}