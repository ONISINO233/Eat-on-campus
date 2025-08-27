package onisino.eatoncampus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("onisino.eatoncampus.Mapper")
public class EatOnCampusApplication {
    public static void main(String[] args) {
        SpringApplication.run(EatOnCampusApplication.class, args);
    }

}
