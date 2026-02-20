package week3;
import java.util.*;
public class Data {
	public double sum;
	public double max;
	public int count;
	public Data(){
		sum = 0;
		max = Double.NEGATIVE_INFINITY;
		count = 0 ;
	}
	public void addvalue(double val) {
		sum+=val;
		count++;
		if(val > max) {
			max = val;
		}
	}
	public double sum() {
		return sum;
	}
	public double average() {
		double avg = sum/count;
		return avg;
	}
	public double largest() {
		return max;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Data val = new Data();
		while(true) {
			System.out.print("Enter your number(Q to quit):");
			String value = input.next();
			String quit = "Q";
			if(value.equals(quit)) {
				break;
			}
			double add = Double.parseDouble(value);
			val.addvalue(add);
		}
		System.out.print("Sum is:" + val.sum() + "\n");
		System.out.print("Avg is:" + val.average() + "\n");
		System.out.print("Max is:" + val.largest() + "\n");
	}
}
