package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
// actually it can merge Start with Setup by add @SpringBootApplication at the head of Start and context = SpringApplication.run(Start.class);
//@SpringBootApplication
class Start {
    public static void main(String[] data){
        System.out.println("Hello Java-D12");
        ApplicationContext context;
        context = SpringApplication.run(Setup.class);
        System.out.println("Successfully");
//        SpringApplication.exit(context); // if not add this line application will always run until stop manually, but webservice have to be started all the time
        
    }
}

// Dependency Injection
// 1. Field injection - @Autowired at field
// 2. Method injection - @Autowired at set method to wired bean with class
// 3. Constructor injection - use only constructor