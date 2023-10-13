package model;

/***
 * Принцип открытости-закрытости (OCP) (расширили класс Contact)
 * Принцип подстановки Лисков (LSP)
 */
public class ContactWithEmail extends Contact{
    private Email email;

    public ContactWithEmail(String name, String number, String comment, SimpleEmail email) {
        super(name, number, comment);
        this.email = email;
    }
}
