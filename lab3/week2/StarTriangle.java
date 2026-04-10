package week2;
import java.util.Scanner;
public class StarTriangle {
    private int width;
    StarTriangle(int width){
    	this.width = width;
    }
    public String toString() {
    	String save = "";
    	for(int i=1;i<=width;i++) {
    		for(int j=1;j<=i;j++) {
    			save +="[*]";
    		}
    		save += "\n";
    	}
    	return save;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your width: ");
        int widthin = input.nextInt();
        StarTriangle stringBuild = new StarTriangle(widthin);  
        System.out.print(stringBuild.toString());
    }
}
