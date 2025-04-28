package collections;

import domain.mail.Email;
import domain.mail.MailService;

import java.util.ArrayList;
import java.util.List;

public class MailCollection implements MailService {
    private final List<Email> emails;

    public MailCollection() {
        emails = new ArrayList<>();
    }

    @Override
    public void sendEmail(Email email) {
        emails.add(email);
    }

    public Email lastEmailSent() {
        return emails.stream().findFirst().orElseThrow();
    }
}
