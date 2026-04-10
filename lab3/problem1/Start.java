package problem1;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Danceble[] objects = {
			new Person("Anuar"),
			new Cat("Afina"),
			new Dog("SnoopDog")
		};
		for(Danceble d : objects) {
			d.dance();
			System.out.println("Fav Song is " + d.favSong());
			System.out.println("Dance Styles " + d.danceStyles());
		}
	}

}
