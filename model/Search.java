package model;

import java.util.List;

/**
 * Принцип разделения интерфейсов (ISP)
 */
public interface Search {
    List<Contact> search(String keyWord, List<Contact> contactList);
}
