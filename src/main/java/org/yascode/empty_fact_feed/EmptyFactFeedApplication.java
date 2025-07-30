package org.yascode.empty_fact_feed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class EmptyFactFeedApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmptyFactFeedApplication.class, args);
	}

}
