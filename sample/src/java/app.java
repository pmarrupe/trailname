import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

      profile profile = (profile) context.getBean("profile");

      profile.print1(); 
      profile.print2();
      
   }
}
