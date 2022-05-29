package ru.timshmykov.biomolekula;


import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@RequiredArgsConstructor
public class BiomolekulaApplication {
    public static void main(String[] args) {
        SpringApplication.run(BiomolekulaApplication.class, args);
    }
}

