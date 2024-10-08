package io.github.hikto;

public class User {
    private final String name;
    private static int setId = 1;
    private final int userId;
    private int bookCounter = 0;
    private final Book[] borrowedBooks = new Book[3];

    public User(String name) {
        this.name = name;
        this.userId = setId;
        setId++;
    }

    public User(String name, Book bookName) {
        this.name = name;
        this.userId = setId;
        AddBorrowedBooks(bookName);
        setId++;
    }

    public void AddBorrowedBooks(Book bookName) {
        for (int i = 0; i < GetBorrowedBooks().length; i++) {
            if (GetBorrowedBooks()[i] == null) {
                SetBorrowedBooks(bookName, i);
                return;
            } else if (bookName.GetTitle().equals(GetBorrowedBooks()[i].GetTitle())) {
                System.out.println("---------------------------");
                System.out.println("Sorry, you have the same io.github.hikto.Book!");
                System.out.println("You can't take another one!");
                System.out.println("---------------------------");
                return;
            }
        }
        if (bookCounter >= 3) {
            System.out.println("---------------------------");
            System.out.println("Sorry, You can't take anymore Books!");
            System.out.println("---------------------------");
        }
    }

    public Book[] GetBorrowedBooks() {
        return borrowedBooks;
    }

    public void SetBorrowedBooks(Book bookName, int i) {
        this.borrowedBooks[i] = bookName;
        bookCounter++;
    }

    public void DisplayInfos() {
        System.out.printf("Name = %s\n",  GetName());
        System.out.printf("UserId = %d\n\n", userId);
        System.out.println("BorrowedBooks; ");
        for (int i = 0; (i < GetBorrowedBooks().length && GetBorrowedBooks()[i] != null); i++) {
            System.out.println("---------------------------");
            System.out.printf("[%d]. io.github.hikto.Book = %s\n", i + 1, GetBorrowedBooks()[i].GetTitle());
            System.out.printf("Author = %s\n", GetBorrowedBooks()[i].GetAuthor());
            System.out.printf("ISBN = %d\n", GetBorrowedBooks()[i].GetIsbn());
            System.out.printf("Publication Year = %d\n", GetBorrowedBooks()[i].GetPublicationYear());
            System.out.println("---------------------------");
        }
    }

    public String GetName() {
        return name;
    }

    public int GetUserId() {
        return userId;
    }

    public int GetBookCounter() {
        return bookCounter;
    }
}
