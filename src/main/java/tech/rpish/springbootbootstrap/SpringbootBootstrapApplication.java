package tech.rpish.springbootbootstrap;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("tech.rpish.springbootbootstrap.mapper")
public class SpringbootBootstrapApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBootstrapApplication.class, args);
    }

}
