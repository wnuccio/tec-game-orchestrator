# Notes
The flow in short:
- The user subscribes on a website (which determines the language for emails, the 'locale')
- The user start the game and receives the questions
- The user replies with the answers, and receives a voucher if the score is reached
- The user uses the voucher to choose a reward (a new mail is sent to inform the user about the shipped reward)

# Ideas
- Verify that the user is subscribed before starting the game;
or use some information from the subscription (ex. for the email)
- Verify at most one game per user is currently active
- Verify the game is started before replying to the questions