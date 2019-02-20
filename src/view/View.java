package view;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {

    static String BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(BUNDLE_NAME,
                    new Locale("en"));


    /**
     * Prints message
     * @param message
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printStringInput(String message){
        printMessage(bundle.getString(message));
    }

    public void printWrongInputString(String message){
        concatMessage(bundle.getString(TextConsts.INPUT_WRONG_FORMAT), bundle.getString(message));
    }

    /**
     * Prints error message
     * @param message
     */
    public void printErrorMessage(String message) {
        System.err.println(message);
    }

    /**
     * Concatenate strings and print
     * @param messages
     */
    public void concatMessage(String... messages) {
        StringBuilder sb = new StringBuilder();

        for (String m : messages) {
            sb.append(m).append(" ");
        }

        printMessage(sb.toString());
    }

}
