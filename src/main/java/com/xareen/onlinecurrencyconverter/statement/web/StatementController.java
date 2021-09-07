package com.xareen.onlinecurrencyconverter.statement.web;

import com.xareen.onlinecurrencyconverter.statement.domain.AverageExchangeRates;
import lombok.AllArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/statements")
@AllArgsConstructor
public class StatementController {
    private final RestTemplate restTemplate;

    @GetMapping
    public ResponseEntity<AverageExchangeRates> getStatements() {

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(List.of(MediaType.APPLICATION_JSON));

        return restTemplate.exchange(
                "http://api.nbp.pl/api/exchangerates/tables/A/?format=json",
                HttpMethod.GET,
                new HttpEntity<>(null, httpHeaders),
                AverageExchangeRates.class
        );
    }
}
