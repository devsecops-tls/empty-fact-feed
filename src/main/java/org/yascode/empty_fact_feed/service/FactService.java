package org.yascode.empty_fact_feed.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.yascode.empty_fact_feed.model.FactResponse;
import org.yascode.empty_fact_feed.properties.FactApiProperties;

@Service
public class FactService {

    private final RestClient restClient;
    private final String endpoint;

    public FactService(RestClient.Builder builder, FactApiProperties factApiProperties) {
        this.restClient = builder.baseUrl(factApiProperties.getBaseUrl()).build();
        this.endpoint = factApiProperties.getEndpoint();
    }

    public FactResponse getRandomFact() {
        return restClient.get()
                .uri(endpoint)
                .retrieve()
                .body(FactResponse.class);
    }
}
