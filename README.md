## 📚 Library Management System

A simple **Object-Oriented Programming (OOP)** based mini project in **Java** that allows users to manage books and users in a library.
It supports adding books, registering users, issuing and returning books — all through a terminal-based menu system.

---

### 🧠 **Objective**

To develop a mini system demonstrating the **core concepts of OOP in Java** — including encapsulation, abstraction, and interaction between multiple classes.

---

### ⚙️ **Tech Stack**

* **Language:** Java
* **IDE:** VS Code (or any Java IDE)
* **Tools:** Terminal / Command Prompt

---

### 🏗️ **Project Structure**

```
Library_Management_System/
 ├── Book.java
 ├── User.java
 ├── Library.java
 └── Main.java
```

---

### 🧩 **Class Overview**

#### `Book.java`

Represents a book with attributes:

* `title`
* `author`
* `isIssued`

Includes methods for issuing and returning books.

#### `User.java`

Represents a library user with:

* `name`
* `userId`

#### `Library.java`

Manages collections of books and users.
Includes methods to:

* Add new books or users
* Issue or return a book
* Display all books or users

#### `Main.java`

Contains the menu-driven interface for user interaction using the `Scanner` class.

---

### 💻 **How to Run**

1. **Clone the repository:**

   ```bash
   git clone https://github.com/Ks-Gupta/Library_Management_System.git
   cd Library_Management_System
   ```

2. **Compile all Java files:**

   ```bash
   javac *.java
   ```

3. **Run the program:**

   ```bash
   java Main
   ```

---

### 🧮 **Features**

✅ Add new books to the library
✅ Register users
✅ Issue books to users
✅ Return issued books
✅ View all books and users

---

### 📘 **Sample Output**

```
===== 📚 Library Management System =====

Choose an option:
1. Add Book
2. Add User
3. Issue Book
4. Return Book
5. Show All Books
6. Show All Users
0. Exit
Enter choice: 1
Enter book title: Java Basics
Enter book author: James Gosling
📚 Book added: Java Basics

Enter choice: 2
Enter user name: Alice
Enter user ID: 101
👤 User added: Alice
```

---

### 🧠 **Concepts Demonstrated**

* Object-Oriented Programming (Encapsulation, Abstraction, Classes & Objects)
* ArrayList for dynamic storage
* Menu-driven console program
* Basic input/output handling using `Scanner`

---

### 📈 **Future Enhancements**

* Add file-based data storage (save books & users permanently)
* Include due dates and fine calculation
* Add GUI using JavaFX or Swing
* Enable search and filter functionalities

---
