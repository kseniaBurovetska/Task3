package view;

public class View {

    /**
     * Prints message
     * @param message
     */
    public void printMessage(String message) {
        System.out.println(message);
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
