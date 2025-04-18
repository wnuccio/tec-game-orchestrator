# Prompt

[//]: # (Application description)
Invent a simple application with the following characteristics:
there is a platform operating in two websites
the user can subscribe on one website in a given session
the user can make purchases on any website
a subscribed user can start a game: for a certain period, ex. one month, he will receive mails with questions
a user can connect on the website and give the answer
each answer is verified, and make the user accumulate points
at the end, if a given score is reached, the user receives a voucher through email
the user can use the voucher on the same website of its subscription, to make a purchase with a discount

Generate a short description of the application, including:
the use-cases
an in-memory API, defined as a Java class
the external dependencies
the internal dependencies, that are the 'repositories' interfaces for persistence

Do not generate any code for now, just the description.

[//]: # (Application code)
Generate the whole application, in Java.
The code should include several use-case classes, and the domain classes for business logic.
Focus only on the application and domain logic, and ignore any infrastructural aspects (like the web controller or the database).
External and internal dependencies should be represented by interfaces, and for each of them a failing implementation (unsupported-operation) should be provided.

[//]: # (Test Context)
Generate an in-memory implementation for the dependencies (both internal and external) related to the first use-case.
Name each implementation after the concept with Collection suffix, removing the Service part.
Generate a TestContext class.
Add to TestContext private-package methods that returns lazy-initialized instances for the collections. 
Add a method that returns the use-case instance, initialized with the collections.