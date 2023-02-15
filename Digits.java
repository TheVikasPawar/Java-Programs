import java.util.Scanner;
public class Digits {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number: ");
		long a = in.nextLong();
		int i=0,count=0;
		while(a>0) {
			a=a/10;
			count++;
		}
		System.out.println(count);
	}

}
