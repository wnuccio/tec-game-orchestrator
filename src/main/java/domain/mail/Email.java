package domain.mail;

import domain.session.Website;

public class Email {
    private final String emailAddress;
    private final Website website;
    private final String content;

    public Email(String emailAddress, Website website, String content) {
        this.emailAddress = emailAddress;
        this.website = website;
        this.content = content;
    }

    public String emailAddress() {
        return emailAddress;
    }

    public Website website() {
        return website;
    }

    public String content() {
        return content;
    }
}
