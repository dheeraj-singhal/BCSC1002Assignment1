/*  Created by IntelliJ IDEA.
 *  User: Dheeraj (dheeraj-singhal)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String studentName; // (first name, middle name, last name)
    private long studentUniversityRollNumber;
    private int numberOfBooksIssuedByStudent;
    private Book[] nameOfBooksIssuedByStudent;

    public Student() {
        studentName = "Dheeraj";
        studentUniversityRollNumber = 191500264;
        numberOfBooksIssuedByStudent = 5;
        this.nameOfBooksIssuedByStudent = new Book[numberOfBooksIssuedByStudent];
        for (int index = 0; index < nameOfBooksIssuedByStudent.length; index++) {
            nameOfBooksIssuedByStudent[index] = new Book("Book : " + (index + 1));
        }
    }

    public Student(String studentName, long studentUniversityRollNumber, int numberOfBooksIssuedByStudent, Book[] nameOfBooksIssuedByStudent) {
        this.studentName = studentName;
        this.studentUniversityRollNumber = studentUniversityRollNumber;
        this.numberOfBooksIssuedByStudent = numberOfBooksIssuedByStudent;
        this.nameOfBooksIssuedByStudent = nameOfBooksIssuedByStudent;
    }

    /**
     * This method returns the name of the student.
     *
     * @return The name of the student.
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * This methods sets the name of the student.
     *
     * @param studentName The name of the student you want to set.
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * This method return the university roll number of the student.
     *
     * @return The university roll number of the student.
     */
    public long getStudentUniversityRollNumber() {
        return studentUniversityRollNumber;
    }

    /**
     * This method sets the university roll number of the student.
     *
     * @param studentUniversityRollNumber The university roll number of the student you want to set.
     */
    public void setStudentUniversityRollNumber(long studentUniversityRollNumber) {
        this.studentUniversityRollNumber = studentUniversityRollNumber;
    }

    /**
     * This method returns the number of the books issued by the student.
     *
     * @return The number of the books issued by the student.
     */
    public int getNumberOfBooksIssuedByStudent() {
        return numberOfBooksIssuedByStudent;
    }

    /**
     * This method sets the number of the books issued by the student.
     *
     * @param numberOfBooksIssuedByStudent The number of the books issued by the student.
     */
    public void setNumberOfBooksIssuedByStudent(int numberOfBooksIssuedByStudent) {
        this.numberOfBooksIssuedByStudent = numberOfBooksIssuedByStudent;
    }

    /**
     * This method returns the names of all the books issued by the student.
     *
     * @return The names of all the books issued by the student.
     */
    public Book[] getNameOfBooksIssuedByStudent() {
        return nameOfBooksIssuedByStudent.clone();
    }

    /**
     * This method sets the names of all the books that are issued by the student.
     *
     * @param nameOfBooksIssuedByStudent The names of all the books that are issued by student.
     */
    public void setNameOfBooksIssuedByStudent(Book[] nameOfBooksIssuedByStudent) {
        this.nameOfBooksIssuedByStudent = nameOfBooksIssuedByStudent;
    }

    /**
     * This method checks the name of the book student want to issue.
     *
     * @param nameOfBookToIssue name of the book you want to issue.
     */
    public void issueNewBook(String nameOfBookToIssue) {
        System.out.println("The book : " + nameOfBookToIssue + " is issued to you successfully.");
        nameOfBooksIssuedByStudent[numberOfBooksIssuedByStudent].setBookName(nameOfBookToIssue);
        numberOfBooksIssuedByStudent++;
    }

    /**
     * This method checks the name of the book that student want to return.
     *
     * @param nameOfBookToReturn name of the book you want to return.
     */
    public void returnBook(String nameOfBookToReturn) {
        System.out.println("The book : " + nameOfBookToReturn + " is returned successfully to the library.");
    }

    /**
     * This method shows the name of all the books that are issued by the student.
     */
    public void allIssuedBooks() {
        for (Book book : nameOfBooksIssuedByStudent) {
            System.out.println(book);
        }
    }

    @Override
    public String toString() {
        return String.format("Student name : %s, Student University Roll Number : %d, " +
                        "Number of books issued by the Student : %d, Names of Books Issued by the Student : %s"
                , studentName, studentUniversityRollNumber, numberOfBooksIssuedByStudent, Arrays.toString(nameOfBooksIssuedByStudent));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getStudentUniversityRollNumber() == student.getStudentUniversityRollNumber() &&
                getNumberOfBooksIssuedByStudent() == student.getNumberOfBooksIssuedByStudent() &&
                Objects.equals(getStudentName(), student.getStudentName()) &&
                Arrays.equals(getNameOfBooksIssuedByStudent(), student.getNameOfBooksIssuedByStudent());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getStudentName(), getStudentUniversityRollNumber(), getNumberOfBooksIssuedByStudent());
        result = 31 * result + Arrays.hashCode(getNameOfBooksIssuedByStudent());
        return result;
    }
}
