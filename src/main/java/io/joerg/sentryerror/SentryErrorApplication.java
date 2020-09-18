package io.joerg.sentryerror;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
public class SentryErrorApplication {

    public static void main(String[] args) {
        
        SpringApplication.run(SentryErrorApplication.class, args);
    }
}