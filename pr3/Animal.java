package week4;
class Animal {
    protected String name;
    protected int age;
    public Animal() {
        this.name = "Unknown";
        this.age = 0;
    }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
    public void eat() {
        System.out.println("Animal eats");
    }
    public String toString() {
        return "Animal{name='" + name + "', age=" + age + "}";
    }
    public static void main(String[] args) {
    	Animal a = new Animal();
    	a.makeSound();
    	a.eat();
    	Cat c1 = new Cat();
    	c1.makeSound();
    	c1.eat("Wiskas");
    	Cat c2 =  new Cat("Afina", 4 , "British");
    	c2.makeSound();
    	c2.eat("Fish");
    	c2.eat("Kolbasa");
    	c2.eat("Doner");
    	c2.eat("Burger Burger", 2);
    }
}
