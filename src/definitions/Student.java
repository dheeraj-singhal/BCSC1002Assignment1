/*  Created by IntelliJ IDEA.
 *  User: Dheeraj (dheeraj-singhal)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private String studentName; // (first name, middle name, last name)
    private long studentUniversityRollNumber;
    private int numberOfBooksIssuedByStudent;
    private Book[] nameOfBooksIssuedByStudent;

    public Student() {
        this.nameOfBooksIssuedByStudent = new Book[10];
        for (int i = 0; i < nameOfBooksIssuedByStudent.length; i++) {
            nameOfBooksIssuedByStudent[i] = new Book();
        }
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
}
