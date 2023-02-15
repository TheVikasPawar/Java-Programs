import java.util.Scanner;

public class Marks {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Mark 1: ");
		int a = in.nextInt();
		
		System.out.print("Enter Mark 1: ");
		int b = in.nextInt();
		
		System.out.print("Enter Mark 1: ");
		int c = in.nextInt();
		
		System.out.print("Enter Mark 1: ");
		int d = in.nextInt();
		
		System.out.print("Enter Mark 1: ");
		int e = in.nextInt();
		
		int average=(a+b+c+d+e)/5;
		
		System.out.print("Average Marks is: "+average);
	}

}
