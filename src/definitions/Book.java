/*  Created by IntelliJ IDEA.
 *  User: Dheeraj (dheeraj-singhal)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String bookName;
    private String bookAuthor;
    private String bookISBNNumber;

    public Book() {
        bookName = "Java A Beginner's Guide Eighth Edition";
        bookAuthor = "Herbert Schildt";
        bookISBNNumber = "9781260440225";
    }

    public Book(String bookName, String bookAuthor, String bookISBNNumber) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookISBNNumber = bookISBNNumber;
    }

    public Book(String bookName) {
        this.bookName = bookName;
    }

    /**
     * This method returns the name of the book.
     *
     * @return The name of the book.
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * This method sets the name of the book.
     *
     * @param bookName The name of the book you want to set.
     */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    /**
     * This method return the name of the author of the book.
     *
     * @return The name of the author of the book.
     */
    public String getBookAuthor() {
        return bookAuthor;
    }

    /**
     * This method sets the name of the author of the book.
     *
     * @param bookAuthor The name of the author of the book you want to set.
     */
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    /**
     * This method return the 13-digit ISBN number of the book.
     *
     * @return The 13-digit ISBN number of the book.
     */
    public String getBookISBNNumber() {
        return bookISBNNumber;
    }

    /**
     * This method sets the 13-digit ISBN number of the book.
     *
     * @param bookISBNNumber The 13-digit ISBN number of the book you want to set.
     */
    public void setBookISBNNumber(String bookISBNNumber) {
        this.bookISBNNumber = bookISBNNumber;
    }

    public String toString() {
        return String.format("Name of the Book : %s, Author Name : %s, 13-Digit ISBN Number : %s", getBookName(), getBookAuthor(), getBookISBNNumber());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) &&
                Objects.equals(bookAuthor, book.bookAuthor) &&
                Objects.equals(bookISBNNumber, book.bookISBNNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, bookAuthor, bookISBNNumber);
    }
}
