package com.satya.studentdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableJpaRepositories("com.satya.studentdashboard")
@EntityScan("com.satya.studentdashboard")
public class StudentDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentDashboardApplication.class, args);
    }
}