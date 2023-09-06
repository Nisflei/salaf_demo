package com.example.salaf_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SalafDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SalafDemoApplication.class, args);
    }

    @GetMapping("/")
    public String deucerto(){
        return "Nikinho + Jhonatas + Gois + Ana + Beatriz + Helena = Germinare Tech" ;
    }

}
