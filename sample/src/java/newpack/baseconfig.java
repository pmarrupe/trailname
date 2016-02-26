/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpack;

import org.springframework.context.annotation.*;

@Configuration
public class baseconfig {

@Bean
public HelloW call(){
return new HelloW( call1());
}
    
@Bean
public check call1(){
return new check();
}

}
