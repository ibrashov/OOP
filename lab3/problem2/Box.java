package problem2;

public class Box implements Activety{
	int koCnt;
	public Box(int koCnt) {
		this.koCnt = koCnt;
	}
	public void activity() {
		System.out.println("Box is most intence sport ");
	}
	public void move() {
		System.out.println("GGG 42 wins " + koCnt + " by ko ");
	}
	public int run() {
		return 2;
	}
	public double jump() {
		return 1.4;
	}
	public int rateActiv() {
		// TODO Auto-generated method stub
		return 10;
	}
}
