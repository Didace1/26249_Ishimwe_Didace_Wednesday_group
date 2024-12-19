/*
 * Summary:
 * This program demonstrates how to trigger and handle various exceptions in Java.
 * It includes examples of both checked and unchecked exceptions. For each exception, 
 * a scenario is simulated where the exception might occur. The exceptions are handled 
 * using try-catch blocks, and appropriate messages are displayed to inform the user 
 * about the nature of the error. The goal is to enhance understanding of exception 
 * handling mechanisms by providing practical examples for each exception.
 *
 * Author: [Ishimwe Didace]
 * Date: [19/12/2024]
 */

public class ExceptionHandlingExample {

    // IOException Example
    public static void simulateIOException() {
        try {
            java.io.FileReader file = new java.io.FileReader("nonexistent.txt");
        } catch (java.io.IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }

    // FileNotFoundException Example
    public static void simulateFileNotFoundException() {
        try {
            java.io.FileReader file = new java.io.FileReader("missingfile.txt");
        } catch (java.io.FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: " + e.getMessage());
        }
    }

    // EOFException Example
    public static void simulateEOFException() {
        try {
            java.io.DataInputStream dis = new java.io.DataInputStream(new java.io.FileInputStream("emptyfile.txt"));
            while (true) {
                dis.readByte(); // Continues until EOFException is thrown
            }
        } catch (java.io.EOFException e) {
            System.out.println("EOFException caught: Reached end of file.");
        } catch (java.io.IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }

    // SQLException Example
    public static void simulateSQLException() {
        try {
            java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:invalid:url", "user", "password");
        } catch (java.sql.SQLException e) {
            System.out.println("SQLException caught: " + e.getMessage());
        }
    }

    // ClassNotFoundException Example
    public static void simulateClassNotFoundException() {
        try {
            Class.forName("com.nonexistent.ClassName");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException caught: " + e.getMessage());
        }
    }

    // Add more methods for unchecked exceptions...

    public static void main(String[] args) {
        simulateIOException();
        simulateFileNotFoundException();
        simulateEOFException();
        simulateSQLException();
        simulateClassNotFoundException();
        // Call other methods...
    }
}
