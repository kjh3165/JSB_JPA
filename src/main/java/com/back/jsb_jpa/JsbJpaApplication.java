package com.back.jsb_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class JsbJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JsbJpaApplication.class, args);
    }

}
