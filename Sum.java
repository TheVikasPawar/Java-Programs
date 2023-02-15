import java.util.Scanner;
public class Sum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int a = in.nextInt();
		int sum=0;
		//Sum of odd number 1 3 5 7 9
		for (int i = 1; i <=a; i=i+2) {
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
