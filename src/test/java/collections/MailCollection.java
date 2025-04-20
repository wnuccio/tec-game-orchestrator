package collections;

import domain.UserId;
import domain.mail.MailService;

import java.util.ArrayList;
import java.util.List;

public class MailCollection implements MailService {
    private final List<MailEntry> mails = new ArrayList<>();

    @Override
    public void sendEmail(UserId userId, String email, String content) {
        mails.add(new MailEntry(email, email, content));
    }

    public List<MailEntry> getMails() {
        return new ArrayList<>(mails);
    }

    public MailEntry lastEmailSent() {
        return mails.stream().findFirst().orElseThrow();
    }

    public static class MailEntry {
        private final String userId;
        private final String content;
        private String emailAddress;

        public MailEntry(String userId, String emailAddress, String content) {
            this.userId = userId;
            this.content = content;
            this.emailAddress = emailAddress;
        }

        public String getUserId() {
            return userId;
        }

        public String getContent() {
            return content;
        }

        public String emailAddress() {
            return emailAddress;
        }
    }
}
