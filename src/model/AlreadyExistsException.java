package model;

public class AlreadyExistsException extends Exception {

    private String login;

    AlreadyExistsException(String message, String login) {
        super(login + message);
        this.login = login;
    }

}
