package com.config.demo.core;

import com.config.demo.birds.models.Eagle;
import com.config.demo.birds.models.Ostrich;
import com.config.demo.fish.models.GoldFish;
import org.springframework.beans.factory.annotation.Autowired;

public class SampleBean {

  @Autowired
  private GoldFish goldFish;

  @Autowired
  private Eagle eagle;

  @Autowired
  private Ostrich ostrich;

  public void printObjects() {

    final String goldFish = this.goldFish.getClass()
                                         .getSimpleName();
    final String eagle = this.eagle.getClass()
                                   .getSimpleName();
    final String ostrich = this.ostrich.getClass()
                                       .getSimpleName();

    System.out.printf(
              "\n╔═════════════════════════════╗\n" +
              "║     %s     ║\n" +
              "╠═════════════════════════════╣\n" +
              "║ --> %s                ║\n" +
              "║ --> %s                   ║\n" +
              "║ --> %s                 ║\n" +
              "╚═════════════════════════════╝\n"
         ,
         "SAMPLE-BEAN-OBJECTS", goldFish, eagle, ostrich
                     );
  }

}