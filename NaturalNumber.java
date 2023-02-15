import java.util.Scanner;

/*	Print First N Natural Number	*/
public class NaturalNumber {
	
	public static void main(String[] args) {
	int sum=0;
	Scanner in = new Scanner(System.in);
	System.out.print("Enter the Number: ");
	int num = in.nextInt();
	
	for(int i=1;i<=num;i++) {
		sum=sum+i;
	}
	System.out.println(sum);
	}
}
