package model;

/**
 * Принцип разделения интерфейсов (ISP)
 * Принцип инверсии зависимостей (DIP)
 */
public interface SaveAs {

    boolean saveAs(String path, PhoneBook phoneBook);
}
