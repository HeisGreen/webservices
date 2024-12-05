# User Management API with Spring Boot

This project is a **User Management API** built using the **Spring Framework**. It includes features like user registration, login, CRUD operations, and secure authentication and authorization using **JWT tokens**. The application is designed to serve as the backend for a mobile application, with the content path set as `/mobile-app`.

---

## Features

- **User Registration:** Create new user accounts.
- **Login with JWT:** Authenticate users and generate secure JWT tokens for subsequent requests.
- **CRUD Operations:** Update and delete user data securely.
- **Role-Based Access Control:** Restrict access to certain endpoints based on user roles.
- **BCrypt Password Encryption:** Ensure secure password storage.
- **JWT Token Validation:** Secure sensitive endpoints by validating tokens.

---

## Tech Stack

- **Java** (Backend Development)
- **Spring Boot** (RESTful API Development)
- **Spring Security** (Authentication & Authorization)
- **JWT Tokens** (Stateless Authentication)
- **Spring Data JPA** (Database Interaction)
- **H2 Database** (Development Database, replaceable for production)
- **BCrypt** (Password Hashing)
- **Maven** (Build Tool)

---

## API Endpoints

### Base Path: `/mobile-app`

| Method | Endpoint             | Description                                | Access               |
|--------|----------------------|--------------------------------------------|----------------------|
| POST   | `/users`             | Register a new user.                      | Public               |
| POST   | `/users/login`       | Authenticate user and generate JWT token. | Public               |
| GET    | `/users/{id}`        | Retrieve a specific user by ID.           | Requires JWT         |
| GET    | `/users`             | Retrieve paginated list of users.         | Requires JWT         |
| PUT    | `/users/{id}`        | Update user information.                  | Requires JWT         |
| DELETE | `/users/{id}`        | Delete a user.                            | Requires JWT         |

---

## Security Configuration

The application uses **Spring Security** with the following setup:

- Public access for `POST /users` and `POST /users/login`.
- Protected access for all other endpoints, requiring a valid JWT token.
- Passwords are hashed with **BCrypt**.
- Custom security filters for authentication (`AuthenticationFilter`) and authorization (`AuthorizationFilter`).

---

## Setup & Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/your-repo-name.git
   cd your-repo-name
   ```

2. **Build the project:**
   ```bash
   mvn clean install
   ```

3. **Run the application:**
   ```bash
   mvn spring-boot:run
   ```

4. **Access API endpoints:**
   - Base URL: `http://localhost:8080/mobile-app`

---

## Future Plans

- **Cloud Deployment:** Deploying the application to **AWS** or **Azure** for better scalability and reliability.
- **Microservices Architecture:** Exploring **Spring Cloud** for transforming this monolith into a distributed system.

---

## Lessons Learned

- Implementing **JWT-based authentication** for stateless security.
- Configuring **Spring Security** for fine-grained access control.
- Debugging and resolving `403 Forbidden` errors with Spring filters.
- Integrating with **Spring Data JPA** for efficient database interactions.

---

## License

This project is open-source and available under the [MIT License](LICENSE).
