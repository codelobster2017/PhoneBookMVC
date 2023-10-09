package view;

import model.Contact;

import java.util.List;

public class ViewPC implements View {
    @Override
    public void printAll(List<Contact> list) {
        System.out.println(list);
    }

    public void printAction(int idAction) {
        switch (idAction) {
            case 0:
                System.out.println("Завершение работы");
                break;
            case 1:
                System.out.println("Введите имя, номер и комментарий: ");
                break;
            case 2:
                System.out.println("Введите имя или номер контакта, \nкоторый вы хотите найти: ");
                break;
            case 3:
                System.out.println("Все контакты: ");
                break;
            default:
                System.out.println("Введите цифру от 0 до 3");
        }

    }

    @Override
    public void successFul(Boolean result, String operation, String comment) {
        if (result) {
            System.out.println(comment + " успешно " + operation);
        } else {
            System.out.println(" не удалось ");
        }
    }

    public void printMenu() {
        System.out.println("""
                Введите цифру
                1 - Добавить контакт
                2 - найти контакты
                3 - показать все
                0 - выход""");
    }
}
