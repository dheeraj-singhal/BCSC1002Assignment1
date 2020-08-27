/*  Created by IntelliJ IDEA.
 *  User: Dheeraj (dheeraj-singhal)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    private Book[] booksCurrentlyAvailable;

    /**
     * This method returns the names of all the books which are currently available in the Library.
     *
     * @return The names of all books which are currently available.
     */
    public Book[] getBooksCurrentlyAvailable() {
        return booksCurrentlyAvailable.clone();
    }

    /**
     * This method sets the names of all the books which are currently available in the library.
     *
     * @param booksCurrentlyAvailable The names of all the books which are currently available.
     */
    public void setBooksCurrentlyAvailable(Book[] booksCurrentlyAvailable) {
        this.booksCurrentlyAvailable = booksCurrentlyAvailable;
    }
}
