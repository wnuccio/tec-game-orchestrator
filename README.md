# Game Orchestrator
An application example to experiment with the TEC framework.

## Structure
Scenario:
- A platform with two Websites
- The user can Subscribe on one website in a given Session
- The user can make Purchase on any website
- A subscribed user can start a game: for a certain period, month he will receive mails with questions.
- The user can connect on the website and give the answer
- Each answer is verified, and accumulate points.
- At the end, it a score is reached, the user receives a Voucher through email
- The user can use the Voucher on the same Website of its Subscription, to make a Purchase with a discounted

Technical Requirements
- The main aggregate is the Game, which relates a subscribed user with a list of Questions.
- A secondary aggregate is the Purchase, as the system want to keep track of purchases for analytical purposes.

Use-cases
- subscribeUser
- startGame
- giveAnswer
- makePurchase (with Voucher)

External Dependencies
- domain.user.User Service (ROC)
- Session Service (FUC)
- Subscription Service (RAW)
- Game Service (RAW) (creates a random question and verifies the answer)
- Mail Service (WOC)
- Purchase Service

Repositories
- Game Repository
- Purchases Repository
