package test.app.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class TestSpringBootMain {

    public static void main(String[] args) {
        SpringApplication.run(TestSpringBootMain.class, args);
    }
}
