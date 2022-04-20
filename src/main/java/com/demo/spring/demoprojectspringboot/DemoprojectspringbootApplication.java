package com.demo.spring.demoprojectspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class DemoprojectspringbootApplication {


    @GetMapping("/message")
    public String message(){
        retrun "you app deployed in azure !"
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoprojectspringbootApplication.class, args);
    }

}
