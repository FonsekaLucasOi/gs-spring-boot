package hello;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext applicationContext) {
        
        return (args) -> {
            
          System.out.println("Vamos inspecionar os Beans presentes no SpringBoot:");
          
          String[] beanNames = applicationContext.getBeanDefinitionNames();
          Arrays.sort(beanNames);
          for (String beanName: beanNames) {
              System.out.println(beanName);
          }
          
        };
        
    }

}
