# TMM_Raffle

---

### Overview

This application is designed to be used for managing and drawing winners in a raffle.
The project is private and should not be shared outside the included contributors.
The tech stack includes:

- Java (_Primary Programming Language_)
- maven (_Build Tool_)
- SpringBoot (_Framework_)
- H2 (_In-Memory/embedded Database_)

---

### Design / Architecture

Please open the Raffle-design.drawio file in [draw.io](https://draw.io/) to view the full design of the application.

#### _Design Decisions_

Given the following:

- The application should be a Full application and not need anything Additional inorder to run.
  - exceptions: Java 22 JRE, a web browser.
- The application should be easy to maintain, and should allow flexible changing of business requirements.

The following is expected:

- The application needs to do server side rendering.
- The application needs to have an embedded Database that is non-volatile.
- The application needs to server all front-end pages through either **http** or **https**.

Additionally, I wanted to keep to a cleaner more simplistic design that is easy to work with.

- The Data layer should only deal with storing and retrieving data.
  - The Dao will take all PoJos' and convert them to Entities before saving them.
  - The Dao will have methods for finding Entities, these methods will return PoJos.
  - The Dao should be generic and have multiple instances for different data types.
- The service layer should only deal with the PoJos' it knows.
  - There should be a single orchestrating service that is called and hands off to other type-specific services.
  - There should be a single Logical service that holds all the mathematical calculation methods.
  - There should be a service per Entity / PoJo data-type [Entry, Event, Item, Ticket, User].
    - These data types are Linked to application logic, and thus will be handling different parts of the functionality
      of the program.
- The controller layer should only deal with the Data-Type it knows.

---

### Instructions
TBD
