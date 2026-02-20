
package week3;

public class Temperature {
	private double value;
	private char scale;
	public Temperature() {
		this.value = 0.0;
		this.scale  = 'C';
	}
	public Temperature(double value) {
		this.value = value;
		this.scale = 'C';
	}
	public void setScale(char scale) {
		char s = Character.toUpperCase(scale);
		if(s == 'C' || s == 'F') {
			this.scale = s;
		}else {
			this.scale = 'C';
		}
	}
	public Temperature(char scale) {
		this.value = 0;
		setScale(scale);
	}
	public Temperature(double valur, char scale) {
		this.value = value;
		setScale(scale);
	}
	public double getCel(){
		if(scale == 'C') {
			return value;
		}
		return 5*(value - 32)/9;
	}
	public double getFah() {
		if(scale == 'F') {
			return value;
		}
		return 9*(value/5) +32;
	}
	
	public static void main(String[] args) {
		Temperature t1 = new  Temperature();
		Temperature t2 = new  Temperature(100);
		Temperature t3 = new  Temperature('F');
		System.out.println("t1 C=" + t1.getCel() + " F=" + t1.getFah());
        System.out.println("t2 C=" + t2.getCel() + " F=" + t2.getFah());
        System.out.println("t3 C=" + t3.getCel() + " F=" + t3.getFah());
		
	}

}
