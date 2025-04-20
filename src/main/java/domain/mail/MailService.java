package domain.mail;

import domain.UserId;

public interface MailService {
    void sendEmail(UserId userId, String email, String content);
}
