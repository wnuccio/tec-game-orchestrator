package domain.user;

public class User {
    private final int id;
    private final String name;
    private final String lastname;
    private final String mail;

    public User(int id, String name, String lastname, String mail) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.mail = mail;
    }

    public int id() {
        return id;
    }
}