package problem4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Start {
    public static void main(String[] args) {
    	Employee e1 = new Employee("Alice", 5000.0, new Date(120, 5, 10), "INS001");
    	Employee e2 = new Employee("Bob", 6000.0, new Date(121, 3, 15), "INS002");
    	Employee e3 = new Employee("Charlie", 4500.0, new Date(119, 8, 20), "INS003");
    	Manager m1 = new Manager("David", 7000.0, new Date(118, 1, 5), "INS010", 1000.0);
    	Manager m2 = new Manager("Eva", 7000.0, new Date(117, 7, 25), "INS011", 1500.0);
        m1.addEmployee(e1);
        m1.addEmployee(e2);
        m2.addEmployee(e3);
        System.out.println(" toString test ");
        System.out.println(e1);
        System.out.println(m1);
        System.out.println("\n equals ");
        Employee e1Copy = e1.clone();
        System.out.println("e1 equals e1Copy: " + e1.equals(e1Copy));
        Manager m1Copy = m1.clone();
        System.out.println("m1 equals m1Copy: " + m1.equals(m1Copy));
        System.out.println("\n compareTo test ");
        System.out.println("e1 compareTo e2: " + e1.compareTo(e2));
        System.out.println("m1 compareTo m2: " + m1.compareTo(m2));
        ArrayList<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(m1);
        list.add(m2);
        System.out.println("\n Sort by salary ");
        Collections.sort(list);
        for (Employee e : list) {
            System.out.println(e);
        }
        System.out.println("\n Sort by name ");
        Collections.sort(list, new NameComparator());
        for (Employee e : list) {
            System.out.println(e);
        }
        System.out.println("\n Sort by hire date ");
        Collections.sort(list, new HireDateComparator());
        for (Employee e : list) {
            System.out.println(e);
        }
        System.out.println("\n clone ");
        Manager clonedManager = m1.clone();
        System.out.println("Original manager: " + m1);
        System.out.println("Cloned manager:   " + clonedManager);

        System.out.println("\n team test ");
        for (Employee emp : m1.getTeam()) {
            System.out.println(emp);
        }
    }
}