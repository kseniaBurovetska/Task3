package controller;

public interface RegexCont {

    String REGEX_NAME = "[А-Я]{1}[а-яА-ЯїЇіІ]+(-?[А-Я]{1}[а-яА-ЯїЇіІ]+)?";
    String REGEX_SURNAME = "([а-яА-ЯїЇіІ]{3}\\s{1})?([а-яА-ЯїЇіІ]{1}')?[А-Я]{1}[а-яА-ЯїЇіІ]+(-?[А-Я]{1}[а-яА-ЯїЇіІ]+)?";
    String REGEX_PATRONYMIC = "[А-Я]{1}[а-яА-ЯїЇіІ]+";

}
