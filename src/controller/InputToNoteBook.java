package controller;

import view.TextConsts;
import view.View;

import java.util.Scanner;

public class InputToNoteBook {

    private View view;
    private Scanner scanner;
    private String name;
    private String surname;
    private String patronymic;
    private String login;
    private String homePhone;
    private String cellPhone;
    private String email;
    private String address;

    InputToNoteBook(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    public void input() {
        UtilityController uc = new UtilityController(scanner, view);

        surname = uc.inputStringValueRegex(TextConsts.INPUT_SURNAME, RegexCont.REGEX_SURNAME);
        name = uc.inputStringValueRegex(TextConsts.INPUT_NAME, RegexCont.REGEX_NAME);
        patronymic = uc.inputStringValueRegex(TextConsts.INPUT_PATRONYMIC, RegexCont.REGEX_PATRONYMIC);
        login = uc.inputStringValueRegex(TextConsts.INPUT_LOGIN, RegexCont.REGEX_LOGIN);
        homePhone = uc.inputStringValueRegex(TextConsts.INPUT_HOME_PHONE, RegexCont.REGEX_HOME_PHONE);
        cellPhone = uc.inputStringValueRegex(TextConsts.INPUT_CELL_PHONE, RegexCont.REGEX_CELL_PHONE);
        email = uc.inputStringValueRegex(TextConsts.INPUT_EMAIL, RegexCont.REGEX_EMAIL_SKYPE);
        address = uc.inputStringValueRegex(TextConsts.INPUT_ADDRESS, RegexCont.REGEX_ADDRESS);
    }

}
