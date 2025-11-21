package Problem1;

public class CollegeStudent extends Student {
    private int myYear;     // current year in college
    private String myMajor; // student's major

    // Constructor
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        myYear = year;
        myMajor = major;
    }

    // Getter and Setter methods
    public int getYear() { return myYear; }
    public String getMajor() { return myMajor; }

    public void setYear(int year) { myYear = year; }
    public void setMajor(String major) { myMajor = major; }

    // toString method
    public String toString() {
        return super.toString() + ", year: " + myYear + ", major: " + myMajor;
    }
}
