package org.personalProjects;

import org.personalProjects.model.CurrencyModel;
import org.personalProjects.controller.ConsoleController;
import org.personalProjects.controller.CurrencyController;

public class App {
    private final ConsoleController consoleController = new ConsoleController();
    private final CurrencyController currencyController = new CurrencyController();

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    // Run and handle user selections
    private void run() {
        int selection = -1;
        while (selection != 0) {
            consoleController.greetConsole();
            consoleController.mainMenuOptions();
            selection = consoleController.mainMenuSelection();
            if (selection == 1) {
                handleGetAllRates();
            }
        }
    }

    // Call to controller to get all current rates and display to console
    private void handleGetAllRates() {
        CurrencyModel[] currencyModels = currencyController.getAll();
        consoleController.printRates(currencyModels);
    }
}