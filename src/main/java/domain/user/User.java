package domain.user;

import domain.UserId;

public class User {
    private final UserId id;
    private final String name;
    private final String lastname;
    private final String mail;

    public User(UserId id, String name, String lastname, String mail) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.mail = mail;
    }

    public UserId id() {
        return id;
    }
}