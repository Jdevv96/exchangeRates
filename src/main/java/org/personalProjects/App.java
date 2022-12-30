package org.personalProjects;

import org.personalProjects.model.ExchangeRate;
import org.personalProjects.controller.ConsoleController;
import org.personalProjects.controller.RateController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

public class App {
    private static final ConsoleController consoleController = new ConsoleController();
    private static final RateController rateController = new RateController();
    private static ExchangeRate exchange = new ExchangeRate();


    public static void main(String[] args) {
        App app = new App();
        consoleController.greetConsole();
        exchange  = rateController.getAll();
        consoleController.printExchangeRates(exchange);
        //ExchangeRate response = restTemplate.getForObject("https://api.exchangerate.host/latest/", ExchangeRate.class);
        //System.out.println(response.getBase());
        //System.out.println(response.getRates());
    }

    private void handleCurrencyExchangeRates() {
        exchange  = rateController.getAll();
        consoleController.printExchangeRates(exchange);
    }
}