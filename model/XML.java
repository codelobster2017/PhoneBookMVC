package model;

public class XML implements SaveAs {
    @Override
    public boolean saveAs(String path, PhoneBook phoneBook) {
        if (phoneBook != null && path != null) {
            return true;
        }
        return false;
    }
}
