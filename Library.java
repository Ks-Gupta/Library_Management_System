package Library_Management_System;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("📚 Book added: " + book.getTitle());
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("👤 User added: " + user.getName());
    }

    public void issueBook(String title, int userId) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (!book.isIssued()) {
                    book.issueBook();
                    System.out.println("Issued to user ID: " + userId);
                } else {
                    System.out.println("⚠️  Book already issued!");
                }
                return;
            }
        }
        System.out.println("❌ Book not found!");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("❌ Book not found!");
    }

    public void showBooks() {
        System.out.println("\n📖 Available Books:");
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void showUsers() {
        System.out.println("\n👥 Registered Users:");
        if (users.isEmpty()) {
            System.out.println("No users registered.");
        } else {
            for (User user : users) {
                System.out.println(user);
            }
        }
    }
}

