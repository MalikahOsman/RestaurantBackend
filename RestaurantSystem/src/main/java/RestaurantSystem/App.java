package RestaurantSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Hello world!
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableWebMvc
public class App 
{
    public static void main( String[] args )
    {
        //SpringApplication.run(App.class, args);
    }
    //public static void main( String[] args )
//    {
//        System.out.println( "Hello World!" );
//    }
}
