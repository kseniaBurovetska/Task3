package controller;

public interface RegexCont {

    String REGEX_NAME = "[А-ЯІЇ]{1}[а-яїі]+(-?[А-ЯІЇ]{1}[а-яїі]+)?";
    String REGEX_SURNAME = "([а-яА-ЯїЇіІ]{3}\\s{1}){0,2}([а-яА-ЯїЇіІ]{1}')?[А-ЯІЇ]{1}[а-яїі]+(-?[А-ЯІЇ]{1}[а-яїі]+)?";
    String REGEX_PATRONYMIC = "[А-ЯІЇ]{1}[а-яїі]+";
    String REGEX_LOGIN = "[\\w]{1}.*{3,15}";
    String REGEX_HOME_PHONE = "[0-9]{2}\\s?[0-9]{3}\\s?[0-9]{2}\\s?[0-9]{2}";
    String REGEX_CELL_PHONE = "(\\+?[0-9]{2})?[-\\s]?[0-9]{3}[-\\s]?[0-9]{3}[-\\s]?[0-9]{2}[-\\s]?[-\\s]?[0-9]{2}[-\\s]?";
    String REGEX_COMMENT = ".*{,1000}";
    String REGEX_EMAIL_SKYPE = "^[^.]{1}[A-Za-z0-9.]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
                            //[Index]  [Town]                [Street]                 [House]        [Flat?]
    String REGEX_ADDRESS = "[0-9]{4,5},\\s?[А-ЯІЇа-яії\\s|-]+,\\s?[А-ЯІЇа-яії0-9.\\s]+,\\s?[0-9а-я/]+(,\\s?[0-9]+)?";

}
