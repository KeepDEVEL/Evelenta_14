package org.example;

@SpringBootApplication
@EnableDiscoveryClient
public class PersonApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonApplication.class, args);
    }
}
