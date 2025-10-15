package de.cschubert.teamboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TeamBoardApplication {

    // 'public' modifier necessary for spring-boot-maven-plugin to find the method
    public static void main(String[] args) {
		SpringApplication.run(TeamBoardApplication.class, args);
	}

}
