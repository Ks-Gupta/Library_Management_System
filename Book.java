package Library_Management_System;

public class Book {
    private String title;
    private String author;
    private boolean isIssued;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("✅ Book issued: " + title);
        } else {
            System.out.println("⚠️  Book already issued!");
        }
    }

    public void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("✅ Book returned: " + title);
        } else {
            System.out.println("⚠️  Book was not issued!");
        }
    }

    @Override
    public String toString() {
        return "Title: " + title + " | Author: " + author + " | Issued: " + isIssued;
    }
}
