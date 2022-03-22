package de.dagere.peass;

import org.springframework.stereotype.Component;

@Component
public class Callee {

   protected void method1() {
      innerMethod();
   }

   private void innerMethod() {

      try {
         System.out.println("Sleeping...");
         Thread.sleep(20);
      } catch (final InterruptedException e) {
         e.printStackTrace();
      }

   }

}
