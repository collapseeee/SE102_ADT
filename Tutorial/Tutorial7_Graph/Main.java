/**
 * author: Nattikorn Sae-sue, 672115014
 * contact: nattikorn_s@cmu.ac.th
 * file included: Main.java & AdjacencyList.java
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AdjacencyList list = new AdjacencyList();
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your graph (a blank line to exit):");
        while (true) {
            String msg = input.nextLine();
            if (msg.isEmpty()) { break; }
            else {
                String[] splitMsg = msg.split("-");
                try {
                    list.addGraph(Integer.parseInt(splitMsg[0].trim()), Integer.parseInt(splitMsg[1].trim()));
                } catch (NumberFormatException e) {
                    System.out.println("Please enter an integer graph. Try again: ");
                    //return;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Please enter two integers for a graph. Try again: ");
                    //return;
                }
            }
        }
        input.close();
        list.printAdjacencyList();
    }
}