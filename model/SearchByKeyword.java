package model;

import java.util.ArrayList;
import java.util.List;

public class SearchByKeyword implements Search{

    @Override
    public List<Contact> search(String keyWord, List<Contact> contactList) {
        List<Contact> searchContact = new ArrayList<>();
        for (Contact contact : contactList) {
            if (contact.getName().equals(keyWord)){
                searchContact.add(contact);
            }
            if (contact.getNumber().equals(keyWord)){
                searchContact.add(contact);
            }

        }
        return searchContact;
    }
}
