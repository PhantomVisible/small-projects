# Library Management System

A simple **Library Management System** built with **Spring Boot** and **Spring Data JPA**, using an **H2 in-memory database**.  
This application allows managing **Books**, **Authors**, and **Library Patrons**, demonstrating CRUD operations, relationships, and basic service-layer logic.

---

## 🛠 Technologies Used

- Java 21
- Spring Boot 3.5.7
- Spring Data JPA
- Hibernate ORM
- H2 Database (In-memory)
- Maven
- Lombok

---

## 📂 Project Structure
```bash
src/main/java/com/shop/online_shopping/
├── entity
│ ├── Author.java
│ ├── Book.java
│ └── Patron.java
├── repository
│ ├── AuthorRepository.java
│ ├── BookRepository.java
│ └── PatronRepository.java
├── service
│ └── LibraryService.java
├── config
│ └── AppConfig.java
└── OnlineShoppingApplication.java
```


- **Entities**: Represent database tables (`Author`, `Book`, `Patron`) with relationships.
- **Repositories**: Handle data access using Spring Data JPA.
- **LibraryService**: Implements business logic for managing authors, books, and patrons.
- **AppConfig**: Optional configuration for beans or initialization.
- **OnlineShoppingApplication**: Main entry point to run the application.

---

## ⚡ Features

- Add, update, delete, and list authors, books, and patrons.
- Borrow books: associate books with patrons.
- Explore relationships:
    - **One-to-Many**: Author → Books
    - **Many-to-Many**: Patron ↔ Borrowed Books
- In-memory database for easy testing.
- H2 console enabled for real-time data inspection.

---

## 💡 Notes

- This project uses eager fetching for relationships to simplify data access in this example.

- All data is stored in an in-memory database, so it is reset every time the app stops.

- Perfect for learning Spring Data JPA relationships, transactions, and service layer integration.

## 🔗 Future Improvements

- Add REST API endpoints with Spring Web for front-end integration.

- Use a persistent database like MySQL or PostgreSQL.

- Implement DTOs and mapping for cleaner API responses.

- Add unit and integration tests for services and repositories.
##  📌 Author

**Amine EL HAOUAT**
