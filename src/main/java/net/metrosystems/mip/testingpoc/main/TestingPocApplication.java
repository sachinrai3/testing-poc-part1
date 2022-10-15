package net.metrosystems.mip.testingpoc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan("net.metrosystems.mip")
@EnableScheduling
public class TestingPocApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestingPocApplication.class, args);
    }

}
