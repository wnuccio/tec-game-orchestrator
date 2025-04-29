### User Journey
The flow in short:
- The user subscribes on a website
- The user starts the game on the website of her subscription, and receives the questions
- The user replies with the answers; at the end he receives a voucher if the score is reached
- The user spends the voucher to choose a reward


A user visits one of the websites and decides to subscribe, gaining access to exclusive features. Once subscribed, the user can explore the platform and make purchases on either website. To make the experience more engaging, the platform offers a game for subscribed users.

The game begins when the user opts in, initiating a month-long challenge. During this period, the user receives daily or periodic emails containing thought-provoking questions. The user logs into the website to submit answers, which are verified by the system. Each correct answer earns the user points, creating a sense of achievement and progress.

As the game progresses, the user accumulates points and tracks their performance. If the user reaches the predefined score by the end of the game, they are rewarded with a voucher sent via email. This voucher can be redeemed on the website where the user initially subscribed, offering a discount on their next purchase. The journey concludes with the user enjoying their reward, fostering loyalty and encouraging further interaction with the platform.
### Use-Cases
1. **User Subscription**: A user can subscribe to one of the websites during a session
2. **Game Participation**: Subscribed users can start a game, receiving a list of questions
3. **Answer Submission**: Users can submit answers to the questions, at the end they receive a voucher
4. **Voucher Reward**: Users can spend the voucher to receive a reward

## User Subscription use-case
A user which is previously registered can subscribe. 
For legal reasons, each website requires a different subscription, for the same user
The registration is managed by the external UserService, and allows to specify name, lastname and email.
The User Subscription use-case requires the userId, generated during the registration, and the session token.
It verifies that the userId matches an actually registered user.
The session token passed to this use-case contains other information, like the website and a timestamp.
The result of the use-case is a Subscription object, which contains the userId and the website from the session.

## Game Participation use-case
A subscribed user can start a game, receiving a list of questions.
The game participation use-case requires the userId and the session token.
The user can start a game only on the website where he is subscribed, 
which means that the website of the session and the website of the subscription must match.
The user cannot have more than one game active at the same time.
The result of the use-case is a Game object, which contains the userId, the subscriptionId and a list of questions.

## Answer Submission use-case
A user can submit answers to the questions, one at a time.
The answer submission use-case requires the gameId, the questionId, and the answer.
Each given answer is verified; the game ends when all the answers are given.
If all the answers, or a certain number of them, are correct, the game is won, and the game is assigned a voucher.

## Voucher Reward use-case
A user can spend the voucher to receive a reward.
The voucher reward use-case requires the gameId.
The user receives an email to inform him about the spent voucher.

### Dependencies
- User Service (ROC): handles user registration
- Session Service (FUC): manages user sessions
- Subscription Service (RAW): manages user subscriptions
- Email Service (WOC): sends emails to users
- Question Service (ROC): creates random questions and verifies the answer
- Game Repository (RAW): in-memory storage for game-related data, such as questions and answers

