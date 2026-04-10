package problem2;

public class Start {
    public static void main(String[] args) {
        Football football = new Football("Real Madrid");
        Box boxer = new Box(38);

        System.out.println("Football");
        football.move();
        System.out.println("Average run distance: " + football.run() + " km");
        System.out.println("Average jump height: " + football.jump() + " m");

        System.out.println();

        System.out.println("Boxing");
        boxer.activity();
        boxer.move();
        System.out.println("Average steps: " + boxer.run() + " km");
        System.out.println("Average dash: " + boxer.jump() + " m");
        System.out.println("Activity rate: " + boxer.rateActiv());
    }
}