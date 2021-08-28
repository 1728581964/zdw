package com.example.student_mis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.example.student_mis.dao")
public class StudentMisApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentMisApplication.class, args);
    }

}
