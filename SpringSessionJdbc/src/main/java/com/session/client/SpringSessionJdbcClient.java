package com.session.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.jdbc.config.annotation.web.http.EnableJdbcHttpSession;



@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages={"com.session"})
public class SpringSessionJdbcClient {

	public static void main(String[] args) {
		
        SpringApplication.run(SpringSessionJdbcClient.class, args);

	}

}
