
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class profile {
   
    @Autowired
    @Qualifier("student1")        
    student s;
    
    public void print1(){
    System.out.println(s.getAge());
    }
    
    public void print2(){
    System.out.println(s.getName());
    }
    
}
