package controller;

import model.Model;
import view.TextConsts;
import view.View;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void process() {
        Scanner scanner = new Scanner(System.in);
        UtilityController uc = new UtilityController(scanner, view);
        InputToNoteBook noteBook = new InputToNoteBook(model);

        noteBook.setSurname(uc.inputStringValueRegex(TextConsts.INPUT_SURNAME, RegexCont.REGEX_SURNAME));
        noteBook.setName(uc.inputStringValueRegex(TextConsts.INPUT_NAME, RegexCont.REGEX_NAME));
        noteBook.setPatronymic(uc.inputStringValueRegex(TextConsts.INPUT_PATRONYMIC, RegexCont.REGEX_PATRONYMIC));

    }

}
