package domain.user;

import java.util.Objects;

public class User {
    private final UserId id;
    private final String name;
    private final String lastname;
    private final String mail;

    public User(UserId id, String name, String lastname, String mail) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.lastname = Objects.requireNonNull(lastname);
        this.mail = Objects.requireNonNull(mail);
    }

    public UserId id() {
        return id;
    }

    public String emailAddress() {
        return mail;
    }
}