package org.personalProjects.controller;

import org.personalProjects.model.ExchangeRate;

import java.util.Scanner;

public class ConsoleController {

    // Scanner to enable user input
    private final Scanner scanner = new Scanner(System.in);

    // Greets user upon run start
    public void greetConsole() {
        System.out.println("Welcome to the ExchangeRate Application! A helpful tool for converting currencies around the world using each country's three character country code.");
    }

    public int menuOptionsPrompt () {
        int menuOptions;
        System.out.println("Please select an option from the following: ");
        try {
            menuOptions = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            menuOptions = -1;
        }
        return menuOptions;
    }

    public void printMenuOptions() {
        System.out.println("------------------------");
        System.out.println("Currency Exchange Menu");
        System.out.println("------------------------");
        System.out.println("1: List exchange rates (Using EUR as the base)");
        System.out.println("2: List exchange rates using a different base");
        System.out.println("3: Convert a currency amount");
        System.out.println("0: Exit Application");
    }

    public void promptForBaseToConvert() {
        System.out.println();
        System.out.println("Please enter the 3 character country code for the base currency to convert.");


    }
    public String currencyToConvert() {
        String baseCurrency;
        try {
            baseCurrency = scanner.nextLine();
        } catch (Exception e) {
            baseCurrency = null;
            System.out.println("Please enter a valid 3 character country code.");
        }
        return baseCurrency;
    }

    public void printExchangeRate(ExchangeRate exchangeRate) {
        if (exchangeRate!= null) {
            System.out.println("Rates As of: " + exchangeRate.getDate());
            System.out.println("Base: " + exchangeRate.getBase());
            System.out.println("Rates: " + exchangeRate.getRates());
        }
    }

}
