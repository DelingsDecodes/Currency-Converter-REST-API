package com.example.currencyconverter.controller;

import com.example.currencyconverter.dto.ConversionRequest;
import com.example.currencyconverter.dto.ConversionResponse;
import com.example.currencyconverter.service.CurrencyService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ConvertController {

    private final CurrencyService currencyService;

    public ConvertController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @PostMapping("/convert")
    public ConversionResponse convert(@RequestBody ConversionRequest request) {

        double rate = currencyService.getExchangeRate(
                request.getFrom(),
                request.getTo()
        );

        ConversionResponse response = new ConversionResponse();
        response.setFrom(request.getFrom());
        response.setTo(request.getTo());
        response.setAmount(request.getAmount());
        response.setRate(rate);
        response.setResult(request.getAmount() * rate);

        return response;
    }
}
