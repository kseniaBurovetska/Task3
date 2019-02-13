package controller;

import model.Model;

public class InputToNoteBook {

    private Model model;
    private String name;
    private String surname;
    private String patronymic;

    InputToNoteBook(Model model) {
        this.model = model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
}
