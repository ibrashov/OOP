package week3;
import java.util.*;
public class phone {
	enum display{
		OLED,
		LCD,
		AMOLED,
		IPS
	};
	private final String type;
	private final String model;
	private final double height;
	static int count = 0;
	private int battery;
	private display screen;
	static final int MAX_BATTERY = 100;
	phone(String type, String model, double height, display screen){
		this.type = type;
		this.model = model;
		this.screen = screen;
		this.height = height;
	}
	{
		battery = MAX_BATTERY;
		count++;
	}
	public String getType() {
		return type;
	}
	public String getModel() {
		return model;
	}
	public double getHeight() {
		return height;
	}
	public int getBattery() {
		return battery;
	}
	public display getScreen() {
		return screen;
	}
	public void charge() {
		battery = MAX_BATTERY;
	}
	public void charge(int precent) {
		if( precent <= 0 || precent >= 100) return;
	}
	public static void main(String[] args) {
		phone p1 = new phone("Xiaomi", "Mi", 23, display.AMOLED);
		phone p2 = new phone("Samsung", "S", 26, display.IPS);
		p1.charge(30);
		p2.charge(90);
		System.out.print(p1.getModel() + " " + p1.getType() + " " + p1.getBattery() + " " + p1.getHeight() + "\n");
		System.out.print(p2.getModel() + " " + p2.getType() + " " + p2.getBattery() + " " + p2.getHeight() + "\n");
		System.out.print("Count of phone: " + count);
		
	}

}
