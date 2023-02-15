import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int a = in.nextInt();
		int table=1;
		for(int i=1;i<=10;i++) {
			table=a*i;
			System.out.println(table);
		}
	}

}
