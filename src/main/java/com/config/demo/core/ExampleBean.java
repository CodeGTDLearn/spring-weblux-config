package com.config.demo.core;

import com.config.demo.birds.models.Peacock;
import com.config.demo.fish.models.Guppy;
import com.config.demo.fish.models.Salmon;
import org.springframework.beans.factory.annotation.Autowired;

public class ExampleBean {
  
  @Autowired
  private Salmon salmon;
  
  @Autowired
  private Guppy guppy;
  
  @Autowired
  private Peacock peacock;
  
  public void printObjects() {

    final String salmon = this.salmon.getClass()
                                     .getSimpleName();
    final String guppy = this.guppy.getClass()
                                   .getSimpleName();
    final String peacock = this.peacock.getClass()
                                       .getSimpleName();

    System.out.printf(
         "\n╔═════════════════════════════╗\n" +
              "║     %s    ║\n" +
              "╠═════════════════════════════╣\n" +
              "║ --> %s                  ║\n" +
              "║ --> %s                   ║\n" +
              "║ --> %s                 ║\n" +
              "╚═════════════════════════════╝\n"
         ,
         "EXAMPLE-BEAN-OBJECTS", salmon, guppy, peacock
                     );
  }
}