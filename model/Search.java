package model;

import java.util.List;

public interface Search {
    List<Contact> search(String keyWord, List<Contact> contactList);
}
