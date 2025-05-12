# 📘 Jdbc: Concepts + Practice

JDBC (Java Database Connectivity) is an API in Java that allows developers to
connect to and interact with relational databases using SQL.

It provides methods for querying and updating data in a database from Java
applications. JDBC is essential for building database-driven applications.

---
## Concepts:

[//]: # 'concepts-start'


### [JDBC Architecture](notes/src/main/java/com/example/architecture/Architecture.java)
- **Driver Manager**: Loads and manages database drivers.
- **Connection**: Represents a session with the database.
- **Statement/PreparedStatement**: Used to send SQL commands to the database.
- **ResultSet**: Represents data retrieved from the database.

[//]: # 'concept-Architecture'

### **Steps in JDBC**
1. Load the JDBC driver.
2. Establish a connection using `DriverManager.getConnection()`.
3. Create a `Statement` or `PreparedStatement`.
4. Execute queries using `executeQuery()` or `executeUpdate()`.
5. Process the `ResultSet` (for queries).
6. Close the connection and resources.

[//]: # 'concept-Steps'

### **Types of JDBC Statements**
- **Statement**: Used for static SQL queries.
- **PreparedStatement**: Used for dynamic queries with parameters. More secure and efficient.
- **CallableStatement**: Used to execute stored procedures.

[//]: # 'concept-Statements'

### **Transaction Management**
- Use `setAutoCommit(false)` to begin a transaction.
- Use `commit()` and `rollback()` to control changes.

### **Connection Pooling**
- Reuses database connections for efficiency. Provided by libraries like HikariCP, Apache DBCP, etc.

### **JDBC Drivers**
- **Type 1**: JDBC-ODBC bridge
- **Type 2**: Native-API driver
- **Type 3**: Network Protocol driver
- **Type 4**: Thin driver (pure Java driver – most commonly used)

---

[//]: # 'concepts-end'

---

## Practice:

[//]: # 'practice-start'

[//]: # 'practice-end'

---

# 🧩 Challenge

[//]: # 'challenges-start'

### 🔹 1. Student Record System
**Goal**: Create a console-based CRUD application to manage student records (name, age, course).  
**Concepts Practiced**: Connection, PreparedStatement, ResultSet, basic CRUD.

---

### 🔹 2. Library Management Tool
**Goal**: Track books and their availability, along with issued/returned logs.  
**Concepts Practiced**: Multiple tables, foreign key constraints, joins, transactions.

---

### 🔹 3. Login & Registration System
**Goal**: Build a simple user registration and login system.  
**Concepts Practiced**: PreparedStatement (to prevent SQL injection), ResultSet, password validation.

---

### 🔹 4. Banking Transaction Simulation
**Goal**: Implement money transfer between two accounts with transaction rollback if an error occurs.  
**Concepts Practiced**: Transactions, commit, rollback, error handling.

---

### 🔹 5. Product Inventory Dashboard
**Goal**: Display products, add new stock, and update prices from the database.  
**Concepts Practiced**: Read/update queries, batch updates, UI-to-DB logic (optional with JavaFX/Swing).

---

### 🔹 6. Employee Directory with Search
**Goal**: Search employees by name, department, or ID.  
**Concepts Practiced**: SQL `LIKE` queries, parameterized search, pagination (optional).

---

### 🔹 7. Attendance Tracker
**Goal**: Record and view attendance for students/employees.  
**Concepts Practiced**: Insert with current timestamps, querying by date ranges.

---

### 🔹 8. Stored Procedure Caller
**Goal**: Use a stored procedure to calculate average salary by department.  
**Concepts Practiced**: CallableStatement, input/output parameters.

---

### 🔹 9. Sales Report Generator
**Goal**: Generate a report from sales data with total, average, and highest sale.  
**Concepts Practiced**: Aggregation queries, ResultSet processing.

---

### 🔹 10. Task Management System
**Goal**: Add, assign, and update status for tasks in a team project.  
**Concepts Practiced**: Insert/update/delete queries, status flags, transactions for multiple updates.

---

[//]: # 'challenges-end'

---

✅ **Tip:** Tackle each practice during the Sprint.
