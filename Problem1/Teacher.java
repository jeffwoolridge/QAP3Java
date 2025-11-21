package Problem1;

public class Teacher extends Person {
    private String mySubject; // Teacher's subject
    private double mySalary;  // Annual salary

    // Constructor
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        mySubject = subject;
        mySalary = salary;
    }

    // Getter and Setter methods
    public String getSubject() { return mySubject; }
    public double getSalary() { return mySalary; }

    public void setSubject(String subject) { mySubject = subject; }
    public void setSalary(double salary) { mySalary = salary; }

    // toString method
    public String toString() {
        return super.toString() + ", subject: " + mySubject + ", salary: $" + mySalary;
    }
}
