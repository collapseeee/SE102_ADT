/** 
 * author: Nattikorn Saesue, 672115014
 * nattikorn_s@cmu.ac.th
 * Files consist of MyMain.java, MyStudent.java and MyStack.java
 */

public class MyMain {
    public static void main(String[] args) {
        MyStack studentList = new MyStack(7);
        System.out.println("isEmpty: " + studentList.isEmpty());
        studentList.push(new MyStudent(101, "John", "Doe", 3.8));
        studentList.peek();
        studentList.push(new MyStudent(102, "Joe", "Doe", 3.2));
        studentList.push(new MyStudent(104, "Jinn", "Doe", 3.9));
        studentList.push(new MyStudent(103, "James", "Doe", 3.5));
        studentList.push(new MyStudent(106, "Jeff", "Doe", 3.66));
        studentList.push(new MyStudent(105, "Jim", "Doe", 3.75));
        studentList.push(new MyStudent(107, "Johan", "Doe", 3.89));
        System.out.println("isFull: " + studentList.isFull());
        studentList.pop();
        studentList.pop();
        studentList.pop();
        studentList.pop();
        studentList.pop();
        studentList.pop();
        studentList.pop();
        System.out.println("isEmpty: " + studentList.isEmpty());
    } // End main.
}
