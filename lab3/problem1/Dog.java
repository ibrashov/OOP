package problem1;

public class Dog implements Danceble {
	String doggie;
	public Dog(String doggie) {
		this.doggie = doggie;
	}
	public void dance() {
		System.out.println("This " + doggie + " can dance brazil dance" );
	}
	public int danceStyles() {
		return 1;
	}
	public String favSong() {
		return "WHO LET THE DOGS OUT, WHO WHO WHOO";
	}
}
