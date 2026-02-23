package week4;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Vector<Person> people = new Vector<>();
		while(1>0) {
			System.out.println("\n1) Add person");
            System.out.println("2) Print all");
            System.out.println("3) Exit");
            String menu = input.nextLine().trim();
			if(menu.equals("1")) {
				add(input, people);
			}else if(menu.equals("2")) {
				all(people);
			}else if(menu.equals("3")) {
				break;
			}
		}
	}
		private static void add(Scanner input , Vector<Person> people) {
			System.out.println("\n1) Person");
            System.out.println("2) Staff");
            System.out.println("3) Student");
            String enter= input.nextLine().trim();
            System.out.print("Enter name: ");
            String name = input.nextLine().trim();
            System.out.print("Enter address: ");
            String address = input.nextLine().trim();
            if(enter.equals("1")) {
            	people.add(new Person(name, address));
            	System.out.print("Added person: ");
            }else if(enter.equals("2")) {
            	System.out.print("School: ");
            	String school = input.nextLine().trim();
            	System.out.print("Pay: ");
            	double pay = input.nextInt().trim();
            	people.add(new Staff(name, address, school, pay));
            }else if(enter.equals("3")) {
            	System.out.print("Program: ");
            	String program = input.nextLine().trim();
            	System.out.print("Year: ");
            	int year = input.nextInt().trim();
            	System.out.print("Fee: ");
            	double fee = input.nextInt().trim();
            	people.add(new Student(name, address, program, year, fee));
            }     
		}
		private static void all(Vector<Person> people) {
			System.out.println("All people: ");
			for(Person p : people) {
				System.out.println(p);
			}
		}
		
}