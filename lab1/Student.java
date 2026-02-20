package week2;

public class Student {
    private String name;
    private String id;
    private int year;

    private int grade;

    public Student(String name, String id, int year) {
        this.name = name;
        this.id = id;
        this.year = year;
        this.grade = 0;
    }

    public String StudentName() { return name; }
    public String StudentId() { return id; }
    public int StudentYear() { return year; }

    public void increment() {
        this.year += 1;
    }

    public void setGrade(int grade) {
        if (grade < 0) grade = 0;
        if (grade > 100) grade = 100;
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public String toString() {
        return "Student{name='" + name + "', id='" + id + "', year=" + year + ", grade=" + grade + "}";
    }
}