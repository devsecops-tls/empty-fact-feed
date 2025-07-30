package org.yascode.empty_fact_feed.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "fact.api")
@Getter
@Setter
public class FactApiProperties {
    private String baseUrl;
    private String endpoint;
}
