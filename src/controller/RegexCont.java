package controller;

public interface RegexCont {

    String REGEX_NAME = "[А-ЯІЇ]{1}[а-яїі]+(-?[А-ЯІЇ]{1}[а-яїі]+)?";
    String REGEX_SURNAME = "([а-яА-ЯїЇіІ]{3}\\s{1}){0,2}([а-яА-ЯїЇіІ]{1}')?[А-ЯІЇ]{1}[а-яїі]+(-?[А-ЯІЇ]{1}[а-яїі]+)?";
    String REGEX_PATRONYMIC = "[А-ЯІЇ]{1}[а-яїі]+";
    String REGEX_LOGIN = "[a-zA-Z]{1}\\w{3,15}";
    String REGEX_HOME_PHONE = "[0-9]{2}\\s?[0-9]{3}\\s?[0-9]{2}\\s?[0-9]{2}";
    String REGEX_CELL_PHONE = "(\\+?[0-9]{2})?[-\\s]?[0-9]{3}[-\\s]?[0-9]{3}[-\\s]?[0-9]{2}[-\\s]?[-\\s]?[0-9]{2}[-\\s]?";

}
