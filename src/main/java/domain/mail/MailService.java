package domain.mail;

public interface MailService {
    void sendEmail(String userId, String content);
}
