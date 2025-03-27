# SpringSecurityV1 Project

## Overview
SpringSecurityV1 is a web application that demonstrates basic secure authentication and authorization using Spring Security. It provides a robust user management system with role-based access control.

## Features
- **User Authentication**: Secure login and registration system using Spring Security.
- **Role-Based Access Control**: Restrict access based on user roles.
- **Password Encryption**: Secure password storage with hashing.
- **Admin Panel**: Manage users and roles.
- **Thymeleaf Template**: Manage the HTML template using thymeleaf.

## Technologies Used
### Backend
- Java, Spring Boot, Spring Security, Hibernate, Thymeleaf
- Maven, JUnit

### Database
- PostgreSQL

### Authentication
- Basic Authentication

### Storage
- Local storage

## Installation & Setup
### Prerequisites
Ensure you have the following installed on your system:
- Java & Spring Boot
- Database system (PostgreSQL, MySQL, or MongoDB)

### Steps
1. Clone the repository:
   ```sh
   git clone https://github.com/andkcode/SpringSecurityV1.git
   cd SpringSecurityV1
   ```
2. Set up the database:
   ```sh
   npx sequelize db:migrate  # For SQL databases
   ```
3. Start the application:
   ```sh
   npm run dev  # For backend
   ```

## Usage
- Register or log in.
- Manage user roles and permissions.
- Secure API endpoints with role-based access control.

## Contribution
Contributions are welcome! To contribute:
1. Fork the repository.
2. Create a new branch (`feature-xyz`).
3. Commit your changes and push them.
4. Submit a pull request.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact
For queries or collaboration, reach out at:
- **Email**: andriiwork18@gmail.com  
- **GitHub**: [@andkcode](https://github.com/andkcode)

