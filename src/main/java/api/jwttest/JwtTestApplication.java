package api.jwttest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtTestApplication {

    public static void main(String[] args) {
        System.out.println("안녕");
        SpringApplication.run(JwtTestApplication.class, args);
    }

}
