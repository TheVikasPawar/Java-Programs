import java.util.Scanner;

public class DigitAdd {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = in.nextInt();
		int r;
		int sum = 0;
		while(num>0) {
			r=num%10;
			sum=sum+r;
			num=num/10;
		}
		System.out.println(sum);
	}
}
