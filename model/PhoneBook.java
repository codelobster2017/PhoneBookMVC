package model;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contact> contactsList;

    public PhoneBook() {
        contactsList = new ArrayList<>();
    }
    public Boolean addContact(Contact contact) {
       return contactsList.add(contact);
    }
    public List<Contact> getAll(){
        return contactsList;
    }


}
