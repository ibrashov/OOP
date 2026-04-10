package week2;
import java.util.*;
public class Time {
	private int hour;
	private int minute;
	private int second;
	public Time(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public String toUniversal() {
	    return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	public String toStandard() {
	    String ampm = "";
	    if(hour < 12) {
	    	ampm = "Am";
	    }else if(hour >= 12) {
	    	ampm = "Pm";
	    }
	    int h = hour % 12; 
	    if(h == 0) { 
	    	h=12;
	    }
	    return String.format("%02d:%02d:%02d %s", h, minute, second, ampm);
	}
	public String add(Time t2) {
		int sum = 0;
		sum = (hour*3600+minute*60+second) + (t2.hour*3600+t2.minute*60+t2.second);
		sum = sum % 86400;
		hour = sum / 3600;
		sum = sum %3600;
		minute = sum / 60;
		second = sum % 60;
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	public static void main(String[] args) {
		
		Time t = new Time(23,5,6);
		System.out.print("Universal: " + t.toUniversal() + "\n");
		System.out.print("Standard: " + t.toStandard() + "\n");
		Time t2 = new Time(4,24,33);
		t.add(t2);
		System.out.print("Add time: " + t.toUniversal());
	}

}
