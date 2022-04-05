package dev.ahmed.demomp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("dev.ahmed.demomp.mapper")
public class DemompApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemompApplication.class, args);
    }

}
