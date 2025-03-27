/**
 * author: Nattikorn Sae-sue, 672115014
 * contact: nattikorn_s@cmu.ac.th
 * file included: Main.java & AdjacencyList.java
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AdjacencyList {
    // Attribute:
    private HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();

    // Constructor:
    public AdjacencyList() {
    }

    // Method:
    public void addGraph(int head, int tail) {
        graph.putIfAbsent(head, new ArrayList<>()); // Put a new HashMap if the head key doesn't exist.
        graph.get(head).add(tail); // Called the head key and add tail value.

        graph.putIfAbsent(tail, new ArrayList<>()); // Put a new HashMap if the tail key doesn't exist.
        graph.get(tail).add(head); // Called the tail key and add head value.
    }
    public void printAdjacencyList() {
        System.out.println("Adjacency List of the Graph: ");
        for (Map.Entry<Integer, ArrayList<Integer>> entry : graph.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            for (Integer neighbor : entry.getValue()) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}
