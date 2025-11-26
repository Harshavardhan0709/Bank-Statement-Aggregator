**🏦 Bank Statement Aggregator**

A comprehensive Spring Boot-based backend application that aggregates bank statements from multiple branches and banks.
The system handles statement generation, cloud storage using AWS S3, user authentication, and provides seamless statement retrieval and database storage capabilities.


**🎯 Overview**

The Bank Statement Aggregator is an enterprise-grade system designed to:
- Generate dummy bank statements for users across multiple branches
- Securely store statements in AWS S3 with organized folder structures
- Allow users to download and view their statements
- Convert statements into Java objects and persist them in a relational database
- Provide secure user authentication and authorization

**✨ Features**

**Core Functionalities**
- **User Authentication & Authorization**: Secure registration and login using Spring Security
- **Multi-Bank & Multi-Branch Support**: Handle statements from various banks and branches
- **Statement Generation**: Generate dummy bank statements in CSV format
- **AWS S3 Integration**: Upload and organize statements in cloud storage with proper folder hierarchy
- **Statement Download & Processing**: Retrieve statements from S3 and convert to Java objects
- **Database Persistence**: Store statement data with proper relationships and transactions
- **Company & Branch Management**: Manage multiple companies with their respective branches

**Technical Features**
- RESTful API architecture
- Secure password encryption
- Proper entity relationships (One-to-Many, Many-to-One)
- Transaction management for data integrity
- Blob/Text storage for statement data
- Organized S3 bucket structure: `user_id/company_id/branch_id/statements

** 🛠** Technologies Used****

| Category | Technologies |
|----------|-------------|
| **Backend Framework** | Spring Boot 3.x |
| **Language** | Java 17 |
| **Security** | Spring Security |
| **Database** | MySQL 8.x |
| **ORM** | Spring Data JPA, Hibernate |
| **Cloud Storage** | AWS S3 |
| **AWS SDK** | AWS SDK for Java |
| **Build Tool** | Maven |
| **Logging** | SLF4J, Logback |

**🏗 System Architecture**
**Components:**

Client Application: Sends HTTP requests to the backend

Spring Boot Backend: Handles business logic, authentication, and API endpoints

MySQL Database: Stores user data, companies, branches, and transaction records

AWS S3 Bucket: Cloud storage for bank statement files


**Data Flow:**
1. User registers/logs in → Spring Security validates credentials
2. System generates bank statements → Saves locally
3. Statements uploaded to AWS S3 → Organized by user/company/branch
4. User requests statements → Downloads from S3
5. Statements converted to Java objects → Stored in MySQL database



**Entity Relationships**
- One Company → Many Users
- One Company → Many Branches
- One User → Many Bank Statements
- One Branch → Many Bank Statements
- One Bank Statement → Many Transactions

**📦 Prerequisites**
- **Java**: JDK 17 or higher
- **Maven**: 3.6+
- **MySQL**: 8.x
- **AWS Account**: With S3 access
- **IDE**: IntelliJ IDEA, Eclipse, or VS Code




**📁 Project Structure**
**Main Directories:**

**controllers/ - REST API Controllers**
UserController.java - User registration and login endpoints
StatementController.java - Bank statement management endpoints

**models/ - Entity Classes**
User.java - User entity with authentication details
Company.java - Company entity
Branch.java - Branch entity
BankStatement.java - Bank statement entity
Transaction.java - Transaction entity

**repositories/ - Data Access Layer**
UserRepository.java - User data operations
CompanyRepository.java - Company data operations
BranchRepository.java - Branch data operations
BankStatementRepository.java - Statement data operations


**services/ - Business Logic Layer**
UserService.java - User-related business logic
StatementService.java - Statement processing logic
AWSService.java - AWS S3 integration logic

**utils/ - Utility Classes**
FileUtils.java - File handling utilities
AWSUtils.java - AWS helper methods

**resources/ - Configuration Files**
application.properties - Application configuration
logback.xml - Logging configuration


**👤 Author**

**Harshavardhan Kanamukkala**
- 📧 Email: k.harsha0719@gmail.com
- 🔗 LinkedIn: [harshavardhan0709](https://www.linkedin.com/in/harshavardhan0709/)
- 💻 GitHub: [@Harshavardhan0709](https://github.com/Harshavardhan0709)
- 📱 Phone: +91 9381945833


---

**Made with ❤️ by Harshavardhan Kanamukkala**
