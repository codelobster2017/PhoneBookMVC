package model;

public class JSON implements SaveAs {

    @Override
    public boolean saveAs(String path, PhoneBook phoneBook) {
        if (phoneBook != null && path != null) {
            return true;
        }
        return false;
    }
}
