package problem1;

public class Cat implements Danceble{
	String cattie;
	public Cat(String type) {
		this.cattie = type;
	}
	public void dance() {
		System.out.println("This " + cattie + " got some moves");
	}
	public int danceStyles() {
		return 1;
	}
	public String favSong() {
		return "Meow Meow la meoooow";
	}
}
