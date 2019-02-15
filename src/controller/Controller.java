package controller;

import model.Model;
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
        InputToNoteBook noteBook = new InputToNoteBook(scanner, view);

        noteBook.input();

    }

}
