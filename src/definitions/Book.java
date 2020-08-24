/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String bookName;
    private String bookAuthor;
    private String bookISBNNumber;

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
}
