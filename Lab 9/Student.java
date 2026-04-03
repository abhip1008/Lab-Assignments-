import java.io.Serializable;

public class Student implements Comparable<Student>, Cloneable, Serializable {

    private String name;
    private double gpa;

    // constructor
    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    // copy constructor
    public Student(Student other) {
        this.name = other.name;
        this.gpa = other.gpa;
    }

    // compare students by GPA
    @Override
    public int compareTo(Student other) {
        return Double.compare(this.gpa, other.gpa);
    }

    // clone method
    @Override
    public Student clone() {
        return new Student(this);
    }

    public String toString() {
        return name + " GPA: " + gpa;
    }
}