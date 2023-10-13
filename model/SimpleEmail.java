package model;


public class SimpleEmail implements Email{
    String email;

    public SimpleEmail(String email) {
        this.email = email;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String newEmail) {
        email = newEmail;
    }
}
