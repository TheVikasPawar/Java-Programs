import java.util.Scanner;
public class Power {
	public static void main(String[]args) {
		int result=1;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = in.nextInt();
		
		System.out.print("Enter Power Value: ");
		int power = in.nextInt();
		
		for(int i =1;i<=power;i++) {
			result=result*num;
		}
		System.out.println(result);
	}

}
