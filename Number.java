import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int a = in.nextInt();
		
		if(a>0) {
			System.out.println("Positive Number "+a);
		}else {
			System.out.println("Negative Number "+a);
		}
	}

}
