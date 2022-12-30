package org.personalProjects.controller;

import org.personalProjects.model.ExchangeRate;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

public class RateController {
    private final String BASE_API_URL = "https://api.exchangerate.host/latest/";
    private RestTemplate restTemplate = new RestTemplate();




    // Get all exchange rates with EUR as base
    public ExchangeRate getAll () {
        return restTemplate.getForObject(BASE_API_URL, ExchangeRate.class);
    }

    // Get rates with a user given country code
    public ExchangeRate getRatesByBase (String countryCode) {
        return restTemplate.getForObject(BASE_API_URL + "?base=" + countryCode, ExchangeRate.class);
    }
}
