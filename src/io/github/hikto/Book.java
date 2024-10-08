package io.github.hikto;

public class Book {
    private final String title;
    private final String author;
    private final int isbn;
    private final int publicationYear;

    public Book(String title, String author, int isbn, int publicationYear) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
    }

    public String GetTitle() {
        return title;
    }

    public String GetAuthor() {
        return author;
    }

    public int GetIsbn() {
        return isbn;
    }

    public int GetPublicationYear() {
        return publicationYear;
    }
}
