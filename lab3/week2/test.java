package week2;

public class test {
	private int hour;
	private int minute;
	private int second;
	test(int hour, int minute, int second){
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
		}else if(hour >= 12){
			ampm = "Pm";
		}
		int h = hour % 12;
		if(h == 0) {
			h = 12;
		}
		return String.format("%02d:%02d:%02d %s", h , minute, second, ampm);
	}
	public String add(test t2) {
		int sum = 0;
		sum = (hour*3600+minute*60+second)+(t2.hour*3600+t2.minute*60+t2.second);
		sum = sum %86400;
		hour = sum / 3600;
		sum = sum % 60;
		minute = sum / 60;
		second = sum % 60;
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t = new Time(23, 5,6);
		System.out.println(t.toUniversal());// prints "23:05:06"
		System.out.println(t.toStandard());//prints "11:05:06 PM"
		Time t2 = new Time(4,24,33);
		t.add(t2);
		System.out.print(t.toUniversal());
	}

}
