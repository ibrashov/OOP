package problem2;

public class Football implements Moveable {
	String team;
	public Football(String team) {
		this.team = team;
	}
	public void move() {
		System.out.println("Football is most moveable sport ");
	}
	public int run() {
		return 20;
	}
	public double jump() {
		return 2.3;
	}
}
