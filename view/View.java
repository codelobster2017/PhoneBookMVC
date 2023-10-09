package view;

import model.Contact;

import java.util.List;

public interface View {
    public void printAll(List<Contact> phoneBook);

    public void successFul(Boolean result, String operation, String comment);
}
