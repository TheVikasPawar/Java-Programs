import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Year: ");
		int a = in.nextInt();
		
		if(a%4==0) {
			System.out.println(a+" is a Leap Year");
		}else {
			System.out.println(a+" is not a leap year");
		}
	}
}
