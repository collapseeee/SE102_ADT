/**
 *  author: Nattikorn Sae-sue, 672115014
 *  nattikorn_s@cmu.ac.th
 *  package file: QueueMain.java & Queue.java
 */

import java.util.Scanner;
public class QueueMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue queue = new Queue(5);

        System.out.println("Please enter student names (enter ‘quit’ to exit the program):");
        while(input.hasNextLine()) {
            String name = input.nextLine();
            if(name.equalsIgnoreCase("quit")) {
                break;
            } else if(name.equalsIgnoreCase("dequeue")) {
                queue.dequeue();
                queue.display();
            }
            else {
                queue.enqueue(name);
                queue.display();
            }
        }

        System.out.println("The program terminate properly.");
    }
}