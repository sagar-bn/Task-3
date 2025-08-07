# 📚 Library Management System

A simple CLI-based Java project to manage books and users, with support for borrowing and returning books. Built using core Java principles including OOP concepts like inheritance and composition.

## 🎯 Objective
Develop a mini system to manage books and users.

## 🛠️ Tools Used
- Java (JDK 21 or compatible)
- Visual Studio Code
- Terminal / Command Prompt

## 📁 Project Structure
├── Main.java
├── Library.java
├── Book.java
├── EBook.java
├── User.java
├── LibraryCard.java



## ✅ Features
- Add books (physical or eBooks)
- Register users with library cards
- Borrow and return books
- View borrowed books per user
- List all users and books
- CLI-based menu-driven system

## 🧠 OOP Concepts Used
- **Inheritance:** `EBook` extends `Book`
- **Composition (Has-a):** `User` has a `LibraryCard`
- **Encapsulation:** Proper access modifiers used
- **Abstraction:** High-level operations in `Library` class

## ▶️ How to Run
1. Clone the repo or download the `.java` files.
2. Open in VS Code.
3. Compile:
   ```bash
   javac *.java
Run:

bash
Copy
Edit
java Main
👨‍💻 Sample Output
markdown
Copy
Edit
1. List Books
2. List Users
3. Borrow Book
4. Return Book
5. View Borrowed Books
6. Exit

📌 Sample Users
User ID: 101, Name: Alice

User ID: 102, Name: Bob

📌 Sample Books
Book ID: 1, Title: Clean Code

Book ID: 2, Title: Java Basics (EBook)

🔗 Relations
User has-a LibraryCard

Library manages many Book and User objects

EBook is-a Book