# Spring Boot Chat API

A REST API for managing chat messages, built with the Spring Boot stack.

This project demonstrates a professional 3-tier (Controller-Service-Repository) architecture and the core technologies used in modern backend development.

## Core Technologies
* **Java 21**
* **Spring Boot**
    * `Spring Web` (for REST API)
    * `Spring Data JPA`
* **Hibernate** (as the JPA provider)
* **SQL (via H2 Database)** The project uses an in-memory SQL database.
* **Maven**
* **JUnit 5**
* **Lombok**

## API Endpoints

Provides basic **CRUD** (Create, Read, Delete) functionality for messages:

* **`GET /messages`**
    * Retrieves a list of all messages.

* **`POST /messages`**
    * Creates a new message.
    * **Required Request Body (JSON):**
        ```json
        {
          "sender": "Jack",
          "content": "Hello Spring!"
        }
        ```

* **`DELETE /messages/{id}`**
    * Deletes a message by its ID.

## How to Run & Test

1.  **Run:** Clone the repository and run the `DemoApplication.java` file. The server will start on `http://localhost:8080`.
2.  **Test (API):** Use an API client (like Postman) to send `GET`, `POST`, and `DELETE` requests to the endpoints.
3.  **Test (Database):** While running, view the H2 in-memory database at `http://localhost:8080/h2-console` (JDBC URL: `jdbc:h2:mem:testdb`).
4.  **Test (Unit):** Run the JUnit tests located in `src/test/java/`.
5.  **Test (Raw SQL):** You can run raw **SQL** queries directly in the H2-Console. For example:
    ```sql
    SELECT * FROM MESSAGE WHERE SENDER = 'Jack';
    ```




