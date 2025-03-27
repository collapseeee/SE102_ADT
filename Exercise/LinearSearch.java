/**
 *  672115014
 *  Nattikorn Sae-sue
 *  SE102 ADT: Workshop 1.
 *  LinearSearch.
 */

import java.util.Vector;
import java.util.Random;
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {

        //1. initialize vector with 10 random values type integers.
        Random rand = new Random();
        Vector<Integer> myVector = new Vector<Integer>(10);
        for (int i=0; i<10; i++) {
            //myVector.addElement(rand.nextInt(10));
            myVector.add(i, rand.nextInt(10)); //both work the same way.
        }

        //2. search the given value using the linearSearch method.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int key = input.nextInt();
        input.close();
        if (linearSearch(myVector, key)) {
            System.out.println("Found it.");
        } else {
            System.out.println("Couldn't find it.");
        }

        //3. terminate the program properly, when the search end.
        System.out.println("The vector: " + myVector); //for reusability of the code. you can use for-loop printing. (in case that the vector data type is class.)
        System.out.println("The program terminates properly.");

    }// end main

    public static boolean linearSearch(Vector<Integer> vector , int searchKey) {
        for (int i=0; i<vector.size(); i++) {
            if (vector.elementAt(i) == searchKey) {
                return true;
            }
        }
        return false;
    }// end linearSearch.
}//end class LinearSearch.
