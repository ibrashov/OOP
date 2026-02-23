package week4;

class Cat extends Animal {
    private String breed;
    public Cat() {
        super();
        this.breed = "Unknown";
    }
    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }
    public void eat() {
        System.out.println(name + " eats cat food");
    }
    public void eat(String food) {
        System.out.println(name + " eats " + food);
    }
    public void eat(String food, int times) {
        System.out.println(name + " eats " + food + " " + times + " times");
    }
    public String toString() {
        return "Cat{name='" + name + "', age=" + age + ", breed='" + breed + "'}";
    }
}
