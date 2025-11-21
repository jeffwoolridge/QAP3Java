package Problem1;

public class Student extends Person {
    protected String myIdNum; // Student Id Number
    protected double myGPA;   // Grade Point Average

    // Constructor
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender); // call superclass constructor
        myIdNum = idNum;
        myGPA = gpa;
    }

    // Getter and Setter methods
    public String getIdNum() { return myIdNum; }
    public double getGPA() { return myGPA; }

    public void setIdNum(String idNum) { myIdNum = idNum; }
    public void setGPA(double gpa) { myGPA = gpa; }

    // toString method
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}
