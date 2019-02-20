package controller;

import model.DBNoteBook;
import model.NoteBook;
import view.TextConsts;
import view.View;

import java.util.Scanner;

public class InputToNoteBook {

    UtilityController uc;

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
        uc = new UtilityController(scanner, view);
    }

    String getName() {
        return name;
    }

    String getLogin() {
        return login;
    }

    public void input() {

        if (String.valueOf(view.bundle.getLocale()).equals("en")) {
            name = uc.inputStringValueRegex(TextConsts.INPUT_NAME, RegexCont.REGEX_NAME_EN);
            surname = uc.inputStringValueRegex(TextConsts.INPUT_SURNAME, RegexCont.REGEX_SURNAME_EN);
            //patronymic = uc.inputStringValueRegex(TextConsts.INPUT_PATRONYMIC, RegexCont.REGEX_PATRONYMIC_EN);
            //address = uc.inputStringValueRegex(TextConsts.INPUT_ADDRESS, RegexCont.REGEX_ADDRESS_EN);
        } else {
            surname = uc.inputStringValueRegex(TextConsts.INPUT_SURNAME, RegexCont.REGEX_SURNAME_UA);
            //patronymic = uc.inputStringValueRegex(TextConsts.INPUT_PATRONYMIC, RegexCont.REGEX_PATRONYMIC_UA);
            name = uc.inputStringValueRegex(TextConsts.INPUT_NAME, RegexCont.REGEX_NAME_UA);
            //address = uc.inputStringValueRegex(TextConsts.INPUT_ADDRESS, RegexCont.REGEX_ADDRESS_UA);

        }

        login = uc.inputStringValueRegex(TextConsts.INPUT_LOGIN, RegexCont.REGEX_LOGIN);
        //homePhone = uc.inputStringValueRegex(TextConsts.INPUT_HOME_PHONE, RegexCont.REGEX_HOME_PHONE);
        //cellPhone = uc.inputStringValueRegex(TextConsts.INPUT_CELL_PHONE, RegexCont.REGEX_CELL_PHONE);
        //email = uc.inputStringValueRegex(TextConsts.INPUT_EMAIL, RegexCont.REGEX_EMAIL_SKYPE);
    }


}
