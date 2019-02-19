package model;

public enum DBNoteBook {
    E1("Вася", "login12"),
    E2("Петя", "nigol123"),
    E3("Саша", "inlog1234");

    private String name;
    private String login;

    DBNoteBook(String name, String login) {
        this.name = name;
        this.login = login;
    }

    public static boolean checkLogin(String checked) {
        for (DBNoteBook d : DBNoteBook.values()) {
            if (checked.equals(d.login)) {
                return true;
            }
        }
        return false;
    }

}
