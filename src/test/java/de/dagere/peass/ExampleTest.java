package de.dagere.peass;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ExampleTest {

   @Autowired
   private ExampleClazz exampleClazz;

   @Test
   public void test() {
      exampleClazz.calleeMethod();
      assertNotNull(exampleClazz);
   }

}
