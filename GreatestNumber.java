import java.util.Scanner;
public class GreatestNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int a = in.nextInt();
		
		System.out.print("Enter Number: ");
		int b = in.nextInt();
		
		if(a<b) {
			System.out.println(a+" is Smaller than "+b);
		}else {
			System.out.println(a+" is a greater than "+b);
		}
	}

}
