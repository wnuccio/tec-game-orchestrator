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

[//]: # (Collection)
Generate an in-memory implementation for the xxxxService.
Name the implementation after the concept with Collection suffix, removing the Service part.
In case the interface has only a read method, add a write method only in the implementation.
Use a List in case the object has an identifier usable by the read method.
Use a Map in the other case.

[//]: # (Test Context)
Generate a TestContext class.
Add to TestContext private-package methods that returns lazy-initialized instances for the collections. 
Add a method that returns the use-case instance, initialized with the collections.

[//]: # (Entity)
Generate for testing purposes a class with the Entity suffix to represent the invocation and the result of the first use-case.
The name before the prefix should reflect the name and the status of the corresponding domain entity.
For example, if the domain class is User, and the use-case register a User, the name will be RegisteredUserEntity.
The Entity class should have a constructor that accepts only the TestContext as parameter.
Each other data should be represented as an attribute, and a corresponding setter for it should be added.
The setter should have the 'with' prefix, and return the instance of the Entity.
Add to the Entity a 'get' method.
If it is an external entity, the get method creates an instance of the corresponding class to save in the collection.
If it is an internal entity, the get method invokes the use-case.
In both cases the Entity returns a class suffixed with Result which wraps the result of the operation.
Add the Result class as well.
Add to TestContext a method with no parameter that returns the entity instance.
Name it just with the entity name, without any suffix.