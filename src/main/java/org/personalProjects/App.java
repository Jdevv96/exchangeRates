package org.personalProjects;

import org.personalProjects.model.ExchangeRate;
import org.personalProjects.controller.ConsoleController;
import org.personalProjects.controller.RateController;

public class App {
    private static final ConsoleController consoleController = new ConsoleController();
    private static final RateController rateController = new RateController();
    private static ExchangeRate exchange = new ExchangeRate();


    public static void main(String[] args) {
        App app = new App();
        consoleController.greetConsole();
        app.run();
    }

    private void run () {
        int optionSelection = -1;
        while (optionSelection != 0) {
            consoleController.printMenuOptions();
            optionSelection = consoleController.menuOptionsPrompt();
            if (optionSelection == 1) {
                handleDefaultExchangeRates();
            } else if (optionSelection == 2) {
                consoleController.promptForBaseToConvert();
                handleRatesWithGivenBase();
            }
        }
    }

    private void handleDefaultExchangeRates() {
        exchange  = rateController.getAll();
        System.out.println();
        consoleController.printExchangeRate(exchange);
        System.out.println();
    }

    private void handleRatesWithGivenBase(){
        exchange = rateController.getRatesByBase(consoleController.currencyToConvert());
        System.out.println();
        consoleController.printExchangeRate(exchange);
    }
}