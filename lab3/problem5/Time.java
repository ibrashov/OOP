package problem5;

public class Time extends week2.Time implements Comparable<Time> {

    public Time(int hour, int minute, int second) {
        super(hour, minute, second);
    }
    public int toSeconds() {
        String[] parts = toUniversal().split(":");
        int h = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        int s = Integer.parseInt(parts[2]);
        return h * 3600 + m * 60 + s;
    }
    public int compareTo(Time other) {
        return Integer.compare(this.toSeconds(), other.toSeconds());
    }
    public String toString() {
        return toUniversal();
    }
}