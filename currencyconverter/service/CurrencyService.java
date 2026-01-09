package com.example.currencyconverter.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class CurrencyService {

    private final WebClient webClient;

    public CurrencyService() {
        this.webClient = WebClient.create("https://api.frankfurter.app");
    }
}
