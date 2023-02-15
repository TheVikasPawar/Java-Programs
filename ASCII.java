import java.util.Scanner;

public class ASCII {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Character: ");
		char ch = in.next().charAt(0);
		
		int a = ch;
		System.out.println("ASCII Value is "+a);
	}
}
