/** 
 * author: Nattikorn Saesue, 672115014
 * nattikorn_s@cmu.ac.th
 * Files consist of MyMain.java, MyStudent.java and MyStack.java
 */

public class MyStudent {
    private int SID;
    private String fName, lName;
    private double GPA;

    public MyStudent(){

    }
    public MyStudent(int SID, String fName, String lName, double GPA) {
        this.SID = SID;
        this.fName = fName;
        this.lName = lName;
        this.GPA = GPA;
    }
@Override
    public String toString(){
        return (fName + ", " + lName + ", " + SID);
    }
    public boolean compareTo(MyStudent student){
        return this.GPA > student.GPA;
    }
}