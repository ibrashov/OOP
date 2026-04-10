package problem5;

import problem4.Employee;
import problem4.Manager;
import java.util.Date;

public class Start {
    public static void main(String[] args) {
        Chocolate[] chocolates = {
                new Chocolate("Twix", 50),
                new Chocolate("Snickers", 70),
                new Chocolate("Mars", 45),
                new Chocolate("KitKat", 60)
        };
        System.out.println("Chocolates before quick sort");
        printArray(chocolates);
        Sort.quickSort(chocolates, 0, chocolates.length - 1);
        System.out.println("Chocolates after quick sort");
        printArray(chocolates);
        System.out.println();
        Time[] times = {
                new Time(10, 30, 15),
                new Time(8, 45, 20),
                new Time(10, 15, 10),
                new Time(23, 5, 1)
        };
        System.out.println("Times before quick sort");
        printArray(times);
        Sort.quickSort(times, 0, times.length - 1);
        System.out.println("Times after quick sort");
        printArray(times);
        System.out.println();
        Employee[] employees = {
                new Employee("Alice", 5000, new Date(120, 5, 10), "INS001"),
                new Employee("Bob", 7000, new Date(121, 2, 15), "INS002"),
                new Manager("David", 7000, new Date(119, 1, 5), "INS010", 1200),
                new Employee("Charlie", 4500, new Date(122, 7, 20), "INS003")
        };
        System.out.println("Before quick sort");
        printArray(employees);
        Sort.quickSort(employees, 0, employees.length - 1);
        System.out.println("After quick sort");
        printArray(employees);
    }

    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
    }
}