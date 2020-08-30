/*  Created by IntelliJ IDEA.
 *  User: Dheeraj (dheeraj-singhal)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    private static final int ISSUE_A_NEW_BOOK_FOR_ME = 1;
    private static final int RETURN_A_PREVIOUSLY_ISSUES_BOOK_FOR_ME = 2;
    private static final int SHOW_ME_ALL_MY_ISSUES_BOOKS = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentInput;
        Student myStudent = new Student();
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            System.out.println("Enter your choice (1..4) : ");
            studentInput = scanner.nextInt();
            switch (studentInput) {
                case ISSUE_A_NEW_BOOK_FOR_ME -> {
                    System.out.println("Please, Enter the name of the book you want to issue : ");
                    scanner.nextLine();
                    String nameOfIssueBook = scanner.nextLine();
                    myStudent.issueNewBook(nameOfIssueBook);
                }
                case RETURN_A_PREVIOUSLY_ISSUES_BOOK_FOR_ME -> {
                    System.out.println("Please, Enter the name of the book that you want to return : ");
                    scanner.nextLine();
                    String nameOfReturnBook = scanner.nextLine();
                    myStudent.returnBook(nameOfReturnBook);
                }
                case SHOW_ME_ALL_MY_ISSUES_BOOKS -> {
                    System.out.println("All the books issued to you are : ");
                    myStudent.allIssuedBooks();
                }
                case EXIT -> System.out.println("Thanks for visiting the Library.");
                default -> System.out.println("Wrong Choice. Choose between 1 to 4.");
            }
        } while (studentInput != EXIT);
        scanner.close();
    }
}
