package week3;
import java.util.*;
enum Gender {
    BOY, GIRL
}
class Person {
    private final Gender gender;
    private final String name;
    public Person(Gender gender, String name) {
        this.gender = gender;
        this.name = name;
    }
    public Gender getGender() {
        return gender;
    }
    public String toString() {
        return name + "(" + (gender == Gender.BOY ? "B" : "G") + ")";
    }
}
public class DragonLaunch {
    private final Vector<Person> kidnapped = new Vector<>();
    public void kidnap(Person p) {
        kidnapped.add(p);
    }
    public boolean willDragonEatOrNot() {
        int write = 0;
        for (int i = 0; i < kidnapped.size(); i++) {
            Person current = kidnapped.get(i);
            if (write > 0) {
                Person prev = kidnapped.get(write - 1);
                if (prev.getGender() == Gender.BOY && current.getGender() == Gender.GIRL) {
                    write--;      
                    continue;
                }
            }
            if (write < kidnapped.size()) {
                kidnapped.set(write, current);
            } else {
                kidnapped.add(current);
            }
            write++;
        }
        while (kidnapped.size() > write) {
            kidnapped.remove(kidnapped.size() - 1);
        }
        return kidnapped.size() > 0;
    }
    public String toString() {
        return kidnapped.toString();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DragonLaunch dl = new DragonLaunch();

        System.out.print("Enter line B or G: ");
        String s = in.nextLine().trim().toUpperCase();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'B') dl.kidnap(new Person(Gender.BOY, "P" + (i + 1)));
            else if (ch == 'G') dl.kidnap(new Person(Gender.GIRL, "P" + (i + 1)));
            else System.out.println("Ignored char: " + ch);
        }
        System.out.println("Before: " + dl);
        boolean eat = dl.willDragonEatOrNot();
        System.out.println("After:  " + dl);
        System.out.println(eat ? "Dragon will eat" : "Dragon will not eat");
    }
}
