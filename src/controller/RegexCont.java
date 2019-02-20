package controller;

public interface RegexCont {

    String REGEX_LOGIN = "[\\w]{5,15}";
    String REGEX_HOME_PHONE = "[0-9]{2}\\s?[0-9]{3}\\s?[0-9]{2}\\s?[0-9]{2}";
    String REGEX_CELL_PHONE = "(\\+?[0-9]{2})?[-\\s]?[0-9]{3}[-\\s]?[0-9]{3}[-\\s]?[0-9]{2}[-\\s]?[-\\s]?[0-9]{2}[-\\s]?";
    String REGEX_COMMENT = ".*{,1000}";
    String REGEX_EMAIL_SKYPE = "^[^.][A-Za-z0-9.]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";

    String REGEX_NAME_EN = "[A-Z][a-z]+(-?[A-Z][a-z]+)?";
    String REGEX_SURNAME_EN = "([a-zA-Z]{3}\\s){0,2}([a-zA-Z]')?[A-Z][a-z]+(-?[A-Z][a-z]+)?";
    String REGEX_PATRONYMIC_EN = "[A-Z][a-z]+";
    //[Index]  [Town]                [Street]                 [House]        [Flat?]
    String REGEX_ADDRESS_EN = "[0-9]{4,5},\\s?[A-Za-z\\s|-]+,\\s?[A-Za-z0-9.\\s]+,\\s?[0-9a-z/]+(,\\s?[0-9]+)?";

    String REGEX_NAME_UA = "[А-ЯІЇ][а-яїі]+(-?[А-ЯІЇ][а-яїі]+)?";
    String REGEX_SURNAME_UA = "([а-яА-ЯїЇіІ]{3}\\s){0,2}([а-яА-ЯїЇіІ]')?[А-ЯІЇ][а-яїі]+(-?[А-ЯІЇ][а-яїі]+)?";
    String REGEX_PATRONYMIC_UA = "[А-ЯІЇ][а-яїі]+";
                            //[Index]  [Town]                [Street]                 [House]        [Flat?]
    String REGEX_ADDRESS_UA = "[0-9]{4,5},\\s?[А-ЯІЇа-яії\\s|-]+,\\s?[А-ЯІЇа-яії0-9.\\s]+,\\s?[0-9а-я/]+(,\\s?[0-9]+)?";

}
