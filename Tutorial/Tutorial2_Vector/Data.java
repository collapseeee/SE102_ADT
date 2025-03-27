/**
 * ==========================================================================================================================================
 * author : Nattikorn Sae-sue, 672115014.
 * ==========================================================================================================================================
 * **To compile this file: **
 * 1. _Terminal_ : type `javac Data.java` in the terminal. (make sure that your terminal path is in the same directory as the java file).
 * 2. _VSCode/IntelliJ_ : Compile with IDE (usually automatically)
 * ==========================================================================================================================================
 * **To run this file: **
 * 1. _Terminal_ :
 *  - Note: make sure that the csv file and java file are in the same directory.
 *  - Note: and make sure that your terminal path is in the same directory as the java file.
 *  - `java Data <csv filename>` (e.g. `java Data <953102_701000-2.csv>`)
 * 2. _VSCode/IntelliJ_ :
 *  - Note: make sure that the csv file and java file are in the same directory.
 *  - Press "Run 'Data'" button on the top-right corner of the IDE.
 *  ==========================================================================================================================================
 * **Example output: **
 * Total student: 10
 * A: 2
 * 670000000, ALEX MOORE
 * 670000001, AMAN RONIN
 * B: 0
 * C: 1
 * 670000002, CHRISTIANO RONALD
 * .
 * .
 * .
 * Z: 2
 * 670000009, ZACK MCKENNY
 * 670000010, ZEB LEO
 * Program terminate properly.
 * ==========================================================================================================================================
 */
import java.io.*;
import java.util.*;

class Student {
    //Attributes.
    private String SID;
    private String firstName;
    private String lastName;

    //Constructor.
    public Student(String SID, String firstName, String lastName) {
        this.SID = SID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Method.
    public String toString() {
        return this.SID.replace("\"", "") + ", " + this.firstName.replace("\"", "") + " " + this.lastName.replace("\"", "");
    }
    //Get first character of the first name:
    public char getFirstChar() {
        return this.firstName.charAt(1);  //Since charAt(0) returns ", I used charAt(1) instead to get the first char.
    }
}

public class Data {
    public static void main(String[] args) throws FileNotFoundException {
        //Reading file input.
        String filename = "";
        if (args.length > 0) {
            filename = args[0]; // In case of compiling on visual compiler.
        } else {
            filename = "953102_701000-2.csv"; // In case of compiling on terminal.
        }
        File f = new File(filename);
        Scanner in = new Scanner(f);

        //Skipping unnecessary lines in the csv file.
        for (int i = 0; i < 7; i++) {
            in.nextLine();
        }

        //Extracting data from the csv file using Tokenizer and then storing them in the vector named student.
        Vector<Student> student = new Vector<Student>();
        while (in.hasNextLine()) {
            String dataLine = in.nextLine();
            StringTokenizer stu = new StringTokenizer(dataLine.trim(), ",");
            stu.nextToken();
            student.addElement(new Student(stu.nextToken(), stu.nextToken(), stu.nextToken())); //Add element of ("SID" "FirstName" "LastName") to the vector student
        }

        //Print every student data in the vector.
        /*for (Student i : student) {
            System.out.println(i.toString());
        }
        */

        //Display the result.
        Data data = new Data();
        data.DisplayResult(student);
        System.out.println("Program terminate properly.");
    }

    public void DisplayResult(Vector<Student> student) {
        System.out.println("Total student: " + student.size());

        //Count the number of students for each first letter (A-Z).
        int[] counter = new int[26];
        for (char c='A'; c<='Z'; c++) {
            int stdCounter = 0;
            for (Student s : student) {
                if (s.getFirstChar() == c) {
                    stdCounter++;
                }
            }
            counter[c - 'A'] = stdCounter; //Character in ASCII = 'A' = 65, 'B' = 66, 'C' = 67 and so on. need to subtract by 'A' to get the index.
        }

        //Print the number of students in each letter.
        for (char c='A'; c<='Z'; c++) {

            //Display the number of students
            int studentAmount = counter[c-'A'];
            System.out.println(c + ": " + studentAmount);

            //Display students in each letter.
            if (studentAmount>0) {
                for (Student s : student) {
                    if (s.getFirstChar() == c) {
                        System.out.println(s.toString());
                    }
                }
            }
        }
    }
} 
