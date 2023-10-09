package view;

import model.Contact;

import java.util.List;

public interface View {
    void printAll(List<Contact> phoneBook);

    void successFul(Boolean result, String operation, String comment);
}
