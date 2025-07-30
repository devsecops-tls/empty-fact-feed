package org.yascode.empty_fact_feed.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yascode.empty_fact_feed.model.FactResponse;
import org.yascode.empty_fact_feed.service.FactService;

@RestController
@RequestMapping("/api/v2/facts")
public class FactController {

    private final FactService factService;

    public FactController(FactService factService) {
        this.factService = factService;
    }

    @GetMapping("/random")
    public FactResponse getRandomFact() {
        return factService.getRandomFact();
    }
}