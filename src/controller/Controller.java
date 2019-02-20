package controller;

import model.AlreadyExistsException;
import model.Model;
import model.NoteBook;
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
        InputToNoteBook inputToNoteBook = new InputToNoteBook(scanner, view);
        inputToNoteBook.input();
        NoteBook noteBook;
        try {
            noteBook = new NoteBook(inputToNoteBook.getName(), inputToNoteBook.getLogin());
        }catch (AlreadyExistsException e){
            view.printErrorMessage(e.getMessage());
            this.process();
        }

    }

}
