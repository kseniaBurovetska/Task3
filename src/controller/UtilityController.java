package controller;

import view.TextConsts;
import view.View;

import java.util.Scanner;

public class UtilityController {

    private Scanner scanner;
    private View view;

    public UtilityController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    /**
     * Check input string with regex
     * @param message
     * @param regex
     * @return
     */
    public String inputStringValueRegex(String message, String regex) {
        String res;
        view.printStringInput(message);

        while (!(scanner.hasNext() && (res = scanner.nextLine()).matches(regex))) {
            view.printWrongInputString(message);
        }

        return res;
    }

}
