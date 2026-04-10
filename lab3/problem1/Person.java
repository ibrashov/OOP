package problem1;

public class Person implements Danceble {
	String name;
	public Person(String name) {
		this.name = name;
	}
	public void dance() {
		System.out.println(name + "is a good dancer");
	}
	public int danceStyles() {
		return 10;
	}
	public String favSong() {
		return "Ma Meilleure Ennemie";
	}
	
}
