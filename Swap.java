import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int a = in.nextInt();
		
		System.out.println("Enter the Number: ");
		int b = in.nextInt();
		
		System.out.println("Before Swapping a="+a+" | b="+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After Swapping a="+a+" | b="+b);
		
	}
}
