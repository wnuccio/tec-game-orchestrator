### domain.User Journey
A user visits one of the websites and decides to subscribe, gaining access to exclusive features. Once subscribed, the user can explore the platform and make purchases on either website. To make the experience more engaging, the platform offers a game for subscribed users.

The game begins when the user opts in, initiating a month-long challenge. During this period, the user receives daily or periodic emails containing thought-provoking questions. The user logs into the website to submit answers, which are verified by the system. Each correct answer earns the user points, creating a sense of achievement and progress.

As the game progresses, the user accumulates points and tracks their performance. If the user reaches the predefined score by the end of the game, they are rewarded with a voucher sent via email. This voucher can be redeemed on the website where the user initially subscribed, offering a discount on their next purchase. The journey concludes with the user enjoying their reward, fostering loyalty and encouraging further interaction with the platform.
### Use-Cases
1. **domain.User Subscription**: A user can subscribe to one of the websites during a session.
2. **Purchases**: A user can make purchases on either website.
3. **Game Participation**: Subscribed users can start a game where they receive periodic emails (e.g., for one month) containing questions.
4. **Answer Submission**: Users can log in to the website to submit answers to the questions.
5. **Point Accumulation**: Each verified answer earns the user points.
6. **Voucher Reward**: If a user reaches a predefined score, they receive a voucher via email.
7. **Voucher Redemption**: The voucher can be used on the subscription website to make discounted purchases.

### In-Memory API
The application will include an in-memory API implemented as a Java class. This API will:
- Manage user subscriptions, purchases, and game participation.
- Handle the logic for sending emails, verifying answers, and calculating points.
- Generate and manage vouchers for eligible users.

### External Dependencies
- domain.User Service (ROC)
- Session Service (FUC)
- Subscription Service (RAW)
- Game Service (RAW) (creates a random question and verifies the answer)
- Email Service (WOC)
- Purchase Service (ROC)

### Internal Dependencies
Purchase Repository: Interface for storing and retrieving purchase records.
Game Repository: Interface for managing game-related data, such as questions, answers, and points.
Voucher Repository: Interface for handling voucher generation and redemption.

This architecture ensures modularity and scalability while leveraging in-memory storage for rapid prototyping and testing.