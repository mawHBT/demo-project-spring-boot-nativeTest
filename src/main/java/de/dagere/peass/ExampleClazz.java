package de.dagere.peass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExampleClazz {

   @Autowired
   private Callee callee;

   protected void calleeMethod() {
      callee.method1();
   }

}
