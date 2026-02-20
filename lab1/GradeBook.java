package week3;
import java.util.*;
import week2.Student;

public class GradeBook {
    private Course course;
    private List<Student> students;

    public GradeBook(Course course) {
        this(course, new ArrayList<>());
    }

    public GradeBook(Course course, List<Student> students) {
        this.course = course;
        this.students = new ArrayList<>(students);
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void displayMessage() {
        System.out.print("Welcome " + course.getName());
        System.out.print(course.getDescription());
        System.out.println();
    }	
    public void displayGradeReport() {
        double avg = determineClassAverage();
        Student minS = getMinStudent();
        Student maxS = getMaxStudent();
        System.out.printf("Class avg is ", avg);
        System.out.print("Min grade is " + minS.getGrade()
                    + " (" + minS.StudentName() + ", id: " + minS.StudentId() + "). ");
        System.out.println("Max grade is " + maxS.getGrade()
                    + " (" + maxS.StudentName() + ", id: " + maxS.StudentId() + ").");
        System.out.println();
        System.out.println("Grades distribution:");
        outputBarChart();
        System.out.println();
    }
    public double determineClassAverage() {
        double sum = 0;
        for (Student s : students) {
            sum += s.getGrade();
        }
        return sum / students.size();
    }
    private Student getMinStudent() {
        Student min = students.get(0);
        for (Student s : students) {
            if (s.getGrade() < min.getGrade()) min = s;
        }
        return min;
    }
    private Student getMaxStudent() {
        Student max = students.get(0);
        for (Student s : students) {
            if (s.getGrade() > max.getGrade()) max = s;
        }
        return max;
    }
    public void outputBarChart() {
        int[] freq = new int[11];
        for (Student s : students) {
            int g = s.getGrade();

            if (g == 100) {
                freq[10]++;
            } else {
                freq[g / 10]++;
            }
        }
        for (int i = 0; i <= 10; i++) {
            if (i == 10) {
                System.out.print("100: ");
            } else {
                System.out.print(i * 10 + "-" + (i * 10 + 9) + ": ");
            }

            for (int j = 0; j < freq[i]; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public void outputLetterGrades() {
        int A = 0, B = 0, C = 0, D = 0, F = 0;

        for (Student s : students) {
            int g = s.getGrade();
            if (g >= 90) A++;
            else if (g >= 80) B++;
            else if (g >= 70) C++;
            else if (g >= 60) D++;
            else F++;
        }

        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
        System.out.println("F: " + F);
    }
    public String toString() {
        return "GradeBook{course=" + course + ", students=" + students + "}";
    }
}
