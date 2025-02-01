package gr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("gr.repository")
public class AppTest {
    public static void main(String[] args) {
        SpringApplication.run(AppTest.class, args);

    }
}