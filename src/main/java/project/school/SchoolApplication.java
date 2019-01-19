package project.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchoolApplication {

    public static void main(String[] args) {
        System.out.println("Hello Wolrd!");
        SpringApplication.run(SchoolApplication.class, args);
    }

}

