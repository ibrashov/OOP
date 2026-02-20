package week3;
import java.util.*;
import week2.Student;
public class GradeBookTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Course course = new Course( "to the lab1", "OOP", 5,
                Arrays.asList("Intro to Programming")
        );
        GradeBook gradeBook = new GradeBook(course);
        List<Student> students = new ArrayList<>();
        students.add(new Student("Student A", "1", 1));
        students.add(new Student("Student B", "2", 1));
        students.add(new Student("Student C", "3", 1));
        students.add(new Student("Student D", "4", 1));
        students.add(new Student("Student E", "5", 1));
        students.add(new Student("Student F", "6", 1));
        students.add(new Student("Student G", "7", 1));
        students.add(new Student("Student H", "8", 1));
        students.add(new Student("Student I", "9", 1));
        students.add(new Student("Student J", "10", 1));
        for (Student s : students) {
            gradeBook.addStudent(s);
        }
        gradeBook.displayMessage();
        System.out.println("Input: ");
        for (Student s : students) {
            int g = readGrade(in, s.StudentName());
            s.setGrade(g);
        }
        System.out.println();
        gradeBook.displayGradeReport();

    }
    private static int readGrade(Scanner in, String name) {
        while (true) {
            System.out.print(name + ": ");
            String token = in.nextLine().trim();
            try {
                int grade = Integer.parseInt(token);
                if (grade < 0 || grade > 100) {
                    System.out.println("Grade must be between 0 and 100.");
                    continue;
                }
                return grade;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a number 0..100.");
            }
        }
    }
}
