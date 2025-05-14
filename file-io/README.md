# 📘 FileIo: Concepts + Practice

Java File I/O (Input/Output) enables reading from and writing to
files on the filesystem. The `java.io` and `java.nio` packages provide classes for byte- and character-based data handling. Understanding File I/O is essential for tasks like logging, configuration loading, and data persistence.

---
## Concepts:

[//]: # 'concepts-start'

### **Basic File Handling**
- **File Class** (`java.io.File`)
  - Represents a file or directory path.
  - Methods: `createNewFile()`, `exists()`, `delete()`, `length()`, `listFiles()`.

### **Reading Files**
- **FileReader & BufferedReader**
  - Used for reading character streams.
  - `BufferedReader.readLine()` reads text line by line.

- **FileInputStream**
  - Reads file data in bytes. Suitable for binary files.

### **Writing Files**
- **FileWriter & BufferedWriter**
  - Write character data to files. `BufferedWriter` improves performance with buffering.

- **FileOutputStream**
  - Writes byte data. Good for binary output (images, etc.).

### **Try-With-Resources**
- Ensures file streams are closed automatically using `AutoCloseable`.

### **java.nio.file Package (Modern I/O)**
- **Files Utility Class**
  - `Files.readAllLines()`, `Files.write()`, `Files.copy()`, etc.
- **Paths Class**
  - Represents file paths (`Paths.get("path/to/file.txt")`).

### **Serialization (Optional Advanced)**
- Writing/reading objects using `ObjectOutputStream` and `ObjectInputStream`.

---

[//]: # 'concepts-end'

---

## Practice:

[//]: # 'practice-start'


1. **File Existence Check**
  - Create a program that checks if a file exists, creates it if not, and prints file info.

2. **Read from a File**
  - Read and print the contents of a text file using `BufferedReader`.

3. **Write to a File**
  - Write user input or an array of strings to a file using `BufferedWriter`.

4. **Copy File Contents**
  - Copy content from one file to another using byte streams (`FileInputStream` and `FileOutputStream`).

5. **Line-by-Line File Processor**
  - Read a file line-by-line and count the number of words or lines.

6. **Using Try-With-Resources**
  - Refactor an I/O program to use `try-with-resources` for safe resource handling.

7. **File Operations with NIO**
  - Use `Files` and `Paths` to create, write, read, and delete a file.

8. **Serialize and Deserialize Object** *(optional)*
  - Create a `User` class and write/read it from a file using object streams.


[//]: # 'practice-end'

---

# 🧩 Challenge

[//]: # 'challenges-start'

[//]: # 'challenges-end'

---

✅ **Tip:** Tackle each practice during the Sprint.
