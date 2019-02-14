package controller;

public interface RegexCont {

    String REGEX_NAME = "[А-ЯІЇ]{1}[а-яїі]+(-?[А-ЯІЇ]{1}[а-яїі]+)?";
    String REGEX_SURNAME = "([а-яА-ЯїЇіІ]{3}\\s{1})?([а-яА-ЯїЇіІ]{1}')?[А-ЯІЇ]{1}[а-яїі]+(-?[А-ЯІЇ]{1}[а-яїі]+)?";
    String REGEX_PATRONYMIC = "[А-ЯІЇ]{1}[а-яїі]+";

}
