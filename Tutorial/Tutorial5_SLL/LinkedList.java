/**
 * author: Nattikorn Sae-sue, 672115014
 * nattikorn_s@cmu.ac.th
 * files: CovidVaccine.java, Vaccine.java, Node.java, LinkedList.java and TutorialFifthMain.java
 */

public class LinkedList {
    // Attribute:
    private Node head;
    private int size;

    // Constructor:
    public LinkedList() {
        head = null;
        size = 0;
    }

    // Method:
    public void insert(CovidVaccine data) { // Perform insertion at the end of the node.
        Node newNode = new Node(data);

        if (isEmpty()) { // If the list is empty, insert a new node.
            head = newNode;
            System.out.println(data.toString() + " is inserted as the head of the list.");
        }
        else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
            System.out.println(data.toString() + " is inserted to the list.");
        }
        size++;
    }
    public void traverse() {
        Node current = head;
        System.out.println(current.getData());
        while (current.getNext() != null) {
            current = current.getNext();
            System.out.println(current.getData());
        }
    }
    public int getSize() {
        return this.size;
    }
    public boolean isEmpty() {
        return (head == null);
    }
    public void delete(String ID) { // Delete based on the ID. ( easier to perform a random delete )
        if (isEmpty()) {
            System.out.println("Cannot delete an empty linked list.");
            return;
        } else if (head.getData().getID().equalsIgnoreCase(ID)) {
            System.out.println(head.getData().toString() + " is deleted from the list.");
            head = head.getNext();
            size--;
            return;
        }
        Node current = head;
        while (current.getNext() != null && !current.getNext().getData().getID().equals(ID)) {
            current = current.getNext();
        }
        if (current.getNext() != null) {
            System.out.println(current.getNext().getData().toString() + " is deleted from the list.");
            size--;
            current.setNext(current.getNext().getNext());
        } else if (current.getNext() == null) {
            System.out.println("Applicant with ID: " + ID + " not found.");
        }
    }
    public void deleteAll() {
        head = null;
    }
    public void showRemainingApplicants() {
        if (head == null) {
            System.out.println("No remaining applicants.");
        } else {
            System.out.println("Remaining Applicants: ");
            traverse();
        }
    }
}
