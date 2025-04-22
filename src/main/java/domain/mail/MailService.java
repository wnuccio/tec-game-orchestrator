package domain.mail;

import domain.user.UserId;

public interface MailService {
    void sendEmail(UserId userId, String email, String content);
}
