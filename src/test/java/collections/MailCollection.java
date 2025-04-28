package collections;

import domain.mail.Email;
import domain.mail.MailService;

import java.util.ArrayList;

public class MailCollection implements MailService {
    private final ArrayList<Email> emails;

    public MailCollection() {
        emails = new ArrayList<>();
    }

    @Override
    public void sendEmail(Email email) {
        emails.add(email);
    }

    public Email lastEmailSent() {
        return emails.get(emails.size()-1);
    }
}
