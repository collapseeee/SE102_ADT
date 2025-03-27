/**
 * author: Nattikorn Sae-sue, 672115014
 * nattikorn_s@cmu.ac.th
 * package files: Main.java & Counter.java.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("\n\nProgram start: \n");
        double startTime = System.currentTimeMillis();

        String fileName = "src/input1.txt";
        if (args.length != 0) {
            fileName = args[0];
        } else {
            System.out.println("Please enter the file name after the `java Main`.");
            double endTime = System.currentTimeMillis();
            System.out.println("Total time to execute this program: " + (endTime-startTime) + " millisecond.");

            System.out.println("\nThe program terminate properly without any file input taken!\n\n");
            return;
        }

        File file = new File(fileName);
        Scanner input = new Scanner(file);
        Counter counter = new Counter();

        while(input.hasNextLine()) {
            String line = input.nextLine();
            counter.addTotalLine(1);
            StringTokenizer st = new StringTokenizer(line, " ");
            while(st.hasMoreTokens()) {
                counter.addString(st.nextToken());
                counter.addTotalToken(1);
            }
        }
        counter.display();

        double endTime = System.currentTimeMillis();
        System.out.println("Total time to execute this program: " + (endTime-startTime) + " millisecond.");

        System.out.println("\nThe program terminate properly!\n\n");

    }
}