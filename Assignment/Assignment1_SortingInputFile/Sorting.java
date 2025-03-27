import java.util.Vector;
import java.io.*;

class Sorting {
    public static boolean isSorted;
    public static void quickSortingSID(Vector<Student> student, int lowestIndex, int highestIndex) throws IOException {
        if (lowestIndex < highestIndex) {
            int partitionIndex = partitionSID(student, lowestIndex, highestIndex);
            quickSortingSID(student, lowestIndex, partitionIndex - 1); // Working on the left partition.
            quickSortingSID(student, partitionIndex + 1, highestIndex); // Working on the right partition.
        }
    } // End of quickSorting method for SID.

    public static void quickSortingfName(Vector<Student> student, int lowestIndex, int highestIndex) throws IOException {
        if (lowestIndex < highestIndex) {
            int partitionIndex = partitionfName(student, lowestIndex, highestIndex);
            quickSortingfName(student, lowestIndex, partitionIndex - 1); // Working on the left partition.
            quickSortingfName(student, partitionIndex + 1, highestIndex); // Working on the right partition.
        }
    } // End of quickSorting method for fName.

    public static void quickSortinglName(Vector<Student> student, int lowestIndex, int highestIndex) throws IOException {
        if (lowestIndex < highestIndex) {
            int partitionIndex = partitionlName(student, lowestIndex, highestIndex);
            quickSortinglName(student, lowestIndex, partitionIndex - 1); // Working on the left partition.
            quickSortinglName(student, partitionIndex + 1, highestIndex); // Working on the right partition.
        }
    } // End of quickSorting method for lName.

    private static int partitionfName(Vector<Student> student, int lowestIndex, int highestIndex) {
        int pivotIndex = highestIndex;
        int RPIndex = highestIndex-1;
        int LPIndex = lowestIndex;

        // Pointer moving.
        while (LPIndex <= RPIndex) {
            // Swap the pointers if both don't have to move in this loop.
            if (student.get(pivotIndex).getFirstName().compareTo(student.get(LPIndex).getFirstName()) <= 0
                    && student.get(pivotIndex).getFirstName().compareTo(student.get(RPIndex).getFirstName()) >= 0) {
                swapStudent(student, LPIndex, RPIndex);
                LPIndex++; RPIndex--;
            }
            else if (student.get(pivotIndex).getFirstName().compareTo(student.get(LPIndex).getFirstName()) > 0) {
                LPIndex++; // Move the LP to the right if the current LPIndex value is less than the pivot value.
            }
            else if (student.get(pivotIndex).getFirstName().compareTo(student.get(RPIndex).getFirstName()) < 0) {
                RPIndex--; // Move the RP to the left if the current RPIndex value is less than the pivot value.
            }
        }
        swapStudent(student, LPIndex, pivotIndex);
        return LPIndex; // Return the swapped pivotIndex.
    } // End of partition method for firstName sorting.

    private static int partitionlName(Vector<Student> student, int lowestIndex, int highestIndex) {
        int pivotIndex = highestIndex;
        int RPIndex = highestIndex-1;
        int LPIndex = lowestIndex;

        // Pointer moving.
        while (LPIndex <= RPIndex) {
            // Swap the pointers if both don't have to move in this loop.
            if (student.get(pivotIndex).getLastName().compareTo(student.get(LPIndex).getLastName()) <= 0
                    && student.get(pivotIndex).getLastName().compareTo(student.get(RPIndex).getLastName()) >= 0) {
                swapStudent(student, LPIndex, RPIndex);
                LPIndex++; RPIndex--;
            }
            else if (student.get(pivotIndex).getLastName().compareTo(student.get(LPIndex).getLastName()) > 0) {
                LPIndex++; // Move the LP to the right if the current LPIndex value is less than the pivot value.
            }
            else if (student.get(pivotIndex).getLastName().compareTo(student.get(RPIndex).getLastName()) < 0) {
                RPIndex--; // Move the RP to the left if the current RPIndex value is less than the pivot value.
            }
        }
        swapStudent(student, LPIndex, pivotIndex);
        return LPIndex; // Return the swapped pivotIndex.
    } // End of partition method for lastName sorting.

    private static int partitionSID(Vector<Student> student, int lowestIndex, int highestIndex) {
        int pivotIndex = highestIndex;
        int RPIndex = highestIndex-1;
        int LPIndex = lowestIndex;

        // Pointer moving.
        while (LPIndex <= RPIndex) {
            // Swap the pointers if both don't have to move in this loop.
            if (student.get(LPIndex).getIntegerSID() >= student.get(pivotIndex).getIntegerSID()
                    && student.get(RPIndex).getIntegerSID() <= student.get(pivotIndex).getIntegerSID()) {
                swapStudent(student, LPIndex, RPIndex);
                LPIndex++; RPIndex--;
            }
            else if (student.get(LPIndex).getIntegerSID() < student.get(pivotIndex).getIntegerSID()) {
                LPIndex++; // Move the LP to the right if the current LPIndex value is less than the pivot value.
            }
            else if (student.get(RPIndex).getIntegerSID() > student.get(pivotIndex).getIntegerSID()) {
                RPIndex--; // Move the RP to the left if the current RPIndex value is less than the pivot value.
            }
        }
        swapStudent(student, LPIndex, pivotIndex);
        return LPIndex; // Return the swapped pivotIndex.
    } // End of partition method for SID sorting.

    public static void swapStudent(Vector<Student> student, int studentIndex1, int studentIndex2) {
        Student temp = student.get(studentIndex1);
        student.set(studentIndex1, student.get(studentIndex2));
        student.set(studentIndex2, temp);
    } // End of swapStudent method

    public static void searchFirstName(String inputFileName, String inputName) throws FileNotFoundException {
        File inputFile = new File(inputFileName);
        inputName = inputName.toUpperCase().trim();
        if (inputFile.exists()) {
            try {
                Vector<Student> sortedStudent = Program.loadFileToVector(inputFileName, 0);
                boolean found = false;
                for (int i = 0; i < sortedStudent.size(); i++) {
                    // Case-insensitive search
                    if (sortedStudent.elementAt(i).getFirstName().trim().equals(inputName)) {
                        System.out.println("Found at index " + i + ".");
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Not found.");
                }
            } catch (FileNotFoundException e) {
                System.out.println("Error reading sorted file.");
            }
        } else {
            System.out.println("Please sort before doing search.");
        }
    } // End of searchFirstName method.

    public static void saveSortedData(String fileName, Vector<Student> sortedStudent) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        int index = 1;
        for (Student s : sortedStudent) {
            writer.write(index + "," + s.toStringForSaving());
            writer.newLine();
            index++;
        }
        writer.close();
    }
}