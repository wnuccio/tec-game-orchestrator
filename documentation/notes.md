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
- Consider the possibility of a game with many questions;
the answer are given one at a time, and the game ends when all questions have been answered.
This poses another challenge: an entity that manages a sequence of states.
Basically the entity that wraps the giveAnswer use-case shoud do a series of calls, not just one,
as default. In that way in can be reused to test the last use-case (voucher).
- Each use-case should accept a Session as parameter, but this is only relevant in some of them.