/**
 * author: Nattikorn Sae-sue, 672115014.
 * nattikorn_s@cmu.ac.th
 *
 * Program.java
 * Student.java
 * Sorting.java
 * README.md
 */

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;
import java.io.*;

// Main class for file handling and processing.
public class Program {
    public static void main(String[] args) throws IOException {
        // --Argument handling.--
        // Handling error
        if (args.length == 0) {
            System.out.println("Please enter arguments.");
            return;
        } else if (args.length > 2) {
            System.out.println("You have entered too many arguments.");
            return;
        }
        // Handling searching and sorting args.
        String command = args[0];
        String argument1 = args[1];
        String inputFile = "NoInputFileReceived"; // Assigned for error checking.
        String inputName = "NoInputNameReceived"; // Assigned for error checking
        String sortedFile = "NoSortedFileReceived"; // Assigned for error checking
        if (command.equals("-n") || command.equals("-f") || command .equals("-l")) {
            inputFile = argument1;
            sortedFile = "sorted_StudentListByProgram.csv";
        } else if (command.equals("-s")) {
            inputName = argument1;
        }


        // --Read the input file.--
        Vector<Student> student = new Vector<Student>(); // Create a "vector student" that extends the "class Student".
        if (!command.equals("-s")) {
            student = loadFileToVector(inputFile, 7);
            }
            // Test print all student if the file was read correctly.
            //for (Student i : student) {
            //    System.out.println(i.toString());
            //}

        // --End of read input file--
        //================================================================
        // Command handling.
        Vector<Student> sortedList = new Vector<>();
        // Sorting the student data.
        // Using switch statement for command handling.
        // Handling error if the file is not read correctly.

        switch (command) {
            case ("-n") -> { // Sort by SID.
                Sorting.quickSortingSID(student, 0, student.size()-1);
                sortedList = new Vector<>(student);
                Sorting.saveSortedData(sortedFile, sortedList);
                printAllStudent(sortedList);
            }
            case ("-f") -> { // Sort by fName.
                Sorting.quickSortingfName(student, 0, student.size()-1);
                sortedList = new Vector<>(student);
                Sorting.saveSortedData(sortedFile, sortedList);
                printAllStudent(sortedList);
            }
            case ("-l") -> { // Sort by lName.
                Sorting.quickSortinglName(student, 0, student.size()-1);
                sortedList = new Vector<>(student);
                Sorting.saveSortedData(sortedFile, sortedList);
                printAllStudent(sortedList);
            }
            case ("-s") -> { // Search by first name.
                sortedFile = "sorted_StudentListByProgram.csv";
                Sorting.searchFirstName(sortedFile, inputName);
            }
            default -> {
                System.out.println("Unexpected command input: " + args[0]);
                System.out.println("Please select a command:");
                System.out.println("-n to Sort the student by student number");
                System.out.println("-f to Sort the student by first name");
                System.out.println("-l to Sort the student by last name");
                System.out.println("-s to Search by first name (need to run the sorting command first.");
            }
        }
        // --End of argument handling.--
        // ==============================================================================
    } // --End of Main method.--
    public static void printAllStudent(Vector<Student> student) {
        for (Student i : student) {
            System.out.println(i.toString());
        }
    } // --End of printAllStudent method.--

    public static Vector<Student> loadFileToVector(String inputFilename, int SkipLine) throws FileNotFoundException {
        File file = new File(inputFilename);
        Scanner scanner = new Scanner(file);
        Vector<Student> student = new Vector<Student>(); // Create a "vector student" that extends the "class Student".
        for (int i = 0; i < SkipLine; i++) {
            scanner.nextLine();
        } // Skip unnecessary lines.
        // Extract data from the input file using StringTokenizer then store them in the vector.
        while (scanner.hasNextLine()) {
            String dataLine = scanner.nextLine();
            StringTokenizer tokenizer = new StringTokenizer(dataLine.trim(), ","); // StringTokenizer(String input, String delimiter);
            tokenizer.nextToken(); // Skip student class number.
            student.addElement(new Student(tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken()));
            // New Student object with (String SID, String fName, String lName).
        }
        scanner.close();
        return student;
    } // End of loadFile method.
}