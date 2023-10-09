package controller;

import model.*;
import view.ViewPC;

import java.util.Scanner;


public class ControllerPC implements Controller {
    PhoneBook phoneBook;
    ViewPC view;
    Search search;
    Scanner scannerInt;
    Scanner scannerString;
    SaveAs saveAs;

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
        input();
    }

    @Override
    public void input() {
        boolean inputStart = true;
        int idAction;

        while (inputStart) {
            idAction = number();
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
                case 4:
                    if (number() == 1) {
                        saveAs = new XML();
                    } else {
                        saveAs = new XML();
                    }
                    view.successFul(saveAs.saveAs(data(), phoneBook), "сохранен", phoneBook.getClass().getName() + saveAs.getClass().getName());
                    break;
            }
        }
    }


    @Override
    public String data() {
        return scannerString.nextLine();
    }

    @Override
    public int number() {
        return scannerInt.nextInt();
    }


}
