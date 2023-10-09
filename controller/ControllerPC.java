package controller;

import model.Contact;
import model.PhoneBook;
import model.Search;
import model.SearchByKeyword;
import view.ViewPC;

import java.util.Scanner;


public class ControllerPC implements Controller {
    PhoneBook phoneBook;
    ViewPC view;
    Search search;
    Scanner scannerInt;
    Scanner scannerString;
    public ControllerPC() {
        this.phoneBook = new PhoneBook();
        this.view = new ViewPC();
        this.search = new SearchByKeyword();
        scannerInt = new Scanner(System.in);
        scannerString = new Scanner(System.in);
    }

    @Override
    public void menu() {
        view.printMenu();
        inputNumber();
    }

    @Override
    public void inputNumber() {
        boolean inputStart = true;
        int idAction;

        while (inputStart) {
            idAction = scannerInt.nextInt();
            view.printAction(idAction);
            switch (idAction) {
                case 0:
                    inputStart = false;
                    break;
                case 1:
                    Contact contact = new Contact(data(), data(), data());
                    view.successFul(phoneBook.addContact(contact), "добавлен", contact.getName());
                    break;
                case 2:
                    view.printAll(search.search(data(), phoneBook.getAll()));
                    break;
                case 3:
                    view.printAll(phoneBook.getAll());
                    break;
            }
        }
    }

    @Override
    public String data() {
        return scannerString.nextLine();
    }


}
