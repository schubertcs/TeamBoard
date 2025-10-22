package de.cschubert.teamboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class TeamBoardApplication {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }

    // 'public' modifier necessary for spring-boot-maven-plugin to find the method
    public static void main(String[] args) {
		SpringApplication.run(TeamBoardApplication.class, args);
	}

}
