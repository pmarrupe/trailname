/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpack;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class Main {
   public static void main(String[] args) {
      ApplicationContext ctx = 
      new AnnotationConfigApplicationContext(baseconfig.class);
   
      HelloW helloWorld = ctx.getBean(HelloW.class);

      helloWorld.voi();
   
   }
}
