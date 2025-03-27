import java.util.Scanner;
import java.util.Vector;

public class VectorExercise {
    public static void main(String[] args) {
        System.out.println("Enter lines of input, use 'quit' to end the program.");
        
        Vector<String> vector = new Vector<>();
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                String textInput = input.nextLine();
                if ("quit".equals(textInput)) {
                    break;
                }
                vector.add(textInput);
            }
        }
        
        System.out.println("Number of lines: " + vector.size());
        
        if (!vector.isEmpty()) {
            System.out.println("First line: " + vector.firstElement());
        } else {
            System.out.println("No lines were entered.");
        }
        
        System.out.println("Lines in reverse order:");
        for (int i = vector.size() - 1; i >= 0; i--) {
            System.out.println(vector.get(i));
        }
    }
}
