/** 
 * author: Nattikorn Saesue, 672115014
 * nattikorn_s@cmu.ac.th
 * Files consist of MyMain.java, MyStudent.java and MyStack.java
 */

import java.util.Vector;
public class MyStack {
    private int maxSize;
    private int top = -1;
    private Vector<MyStudent> studentStack;
    MyStudent nullStudent = new MyStudent();

    public MyStack(){
        maxSize = 10;
        studentStack = new Vector<>(maxSize);
    }
    public MyStack(int size){
        maxSize = size;
        studentStack = new Vector<>(maxSize);
    }

    public void push(MyStudent student){
        if(isFull()){
            System.out.println("The stack is full.");
        } else {
            top++;
            studentStack.add(student);
            System.out.println("[" + studentStack.elementAt(top).toString() + "] is pushed to the stack.");
        }
    
    }
    public MyStudent pop(){
        emptyHandling();
        System.out.println("[" + studentStack.elementAt(top).toString() + "] is popped from the stack.");
        top--;
        if (!isEmpty()) {
            return studentStack.elementAt(top);
        } else {
            return nullStudent;
        }
    }
    public MyStudent peek(){
        emptyHandling();
        System.out.println("[" + studentStack.elementAt(top).toString() + "] is peeked from the stack.");
        return studentStack.elementAt(top);
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (top == maxSize - 1);
    }
    public void emptyHandling(){
        if(isEmpty()){
            System.out.println("The stack is empty.");
        }
    }
}