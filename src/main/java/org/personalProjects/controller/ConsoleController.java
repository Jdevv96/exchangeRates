package org.personalProjects.controller;

import org.personalProjects.model.ExchangeRate;
import org.springframework.http.ResponseEntity;

import java.util.Scanner;

public class ConsoleController {

    // Scanner to enable user input
    private final Scanner scanner = new Scanner(System.in);

    // Greets user upon run start
    public void greetConsole() {
        System.out.println("Hello! Welcome to ExchangeRate. A helpful tool for converting currencies.");
    }

    public void printExchangeRates(ExchangeRate exchangeRate) {
        if (exchangeRate!= null) {
            System.out.println("Base: " + exchangeRate.getBase());
            System.out.println("As of: " + exchangeRate.getDate());
            System.out.println("Rates: " + exchangeRate.getRates());
        }
    }

}
