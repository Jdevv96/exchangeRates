package org.personalProjects.controller;

import org.personalProjects.model.CurrencyModel;

import java.util.Scanner;

public class ConsoleController {

    // Scanner to enable user input
    private final Scanner scanner = new Scanner(System.in);

    // Greets user upon run start
    public void greetConsole() {
        System.out.println("Hello! Welcome to ExchangeRate. A helpful tool for converting currencies.");
    }

    // Prompts user for main menu selections
    public int mainMenuSelection() {
        int selection;
        System.out.println("Please select an option: ");
        try {
            selection = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            selection = -1;
        }
        return selection;
    }

    // Prompts options for selection
    public void mainMenuOptions() {
        System.out.println();
        System.out.println("-----------Exchange Rate Menu Options-----------");
        System.out.println("1: List all current exchange rates using the Euro (EUR) as the base for conversion.");
        System.out.println("2: List all current exchange rates using a selected country as the base for conversion.");
        System.out.println("0: Exit");
        System.out.println();
    }

    // Logic for printing current rate information and displaying in App
    public void printRates (CurrencyModel[] curencyModels) {
        if (curencyModels != null) {
            System.out.println("----------------------");
            System.out.println("Currency Exchange Rates");
            System.out.println("----------------------");
            for (CurrencyModel currencyModel : curencyModels) {
                System.out.println(currencyModel.toString());
            }
        }
    }
}
