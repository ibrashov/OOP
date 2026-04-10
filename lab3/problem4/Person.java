package problem4;

public class Person {
    protected String name;
    public Person() {
        this.name = "";
    }
    public Person(String name) {
        this.name = name;
    }
    public Person(Person other) {
        this.name = other.name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return "Person[name=" + name + "]";
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        if (name == null) return other.name == null;
        return name.equals(other.name);
    }
}