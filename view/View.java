package view;

import model.Contact;
import model.PhoneBook;

import javax.swing.text.StyledEditorKit;
import java.util.List;

public interface View {
    public void printAll(List<Contact> phoneBook);
    public void successFul(Boolean result, String operation, String comment);
}
