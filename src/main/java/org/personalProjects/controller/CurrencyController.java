package org.personalProjects.controller;

import org.personalProjects.model.CurrencyModel;
import org.springframework.web.client.RestTemplate;

public class CurrencyController {

    private final String BASE_API_URL = "https://api.exchangerate.host/latest/";
    private RestTemplate restTemplate = new RestTemplate();

    // Get all exchange rates with EUR as base
    public CurrencyModel[] getAll () {
        return restTemplate.getForObject(BASE_API_URL, CurrencyModel[].class);
    }


    // Get rates with a user given country code
    public CurrencyModel[] getRatesByBase (String countryCode) {
        return restTemplate.getForObject(BASE_API_URL + "?base=" + countryCode, CurrencyModel[].class);
    }
}
