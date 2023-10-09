package model;

import java.util.Objects;

public class Contact {
    private String name;
    private String number;
    private String comment;


    public Contact(String name, String number, String comment) {
        this.name = name;
        this.number = number;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }


    @Override
    public String toString() {
        return "Контакт " +
                "имя: '" + name + '\'' +
                ", номер: '" + number + '\'' +
                ", комментарий '" + comment + '\'' + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (!Objects.equals(name, contact.name)) return false;
        return Objects.equals(number, contact.number);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        return result;
    }
}
