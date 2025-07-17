package com.example.carpoolapp_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CarpoolAppBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarpoolAppBackendApplication.class, args);
    }

}

@RestController
class DemoController {
    @GetMapping("/")  // Handling the root endpoint
    public String home() {
        return "Carpool Backend is running! Go to /test for the test endpoint.";
    }

    @GetMapping("/test")
    public String test() {
        return "Backend connected!";
    }
}