import java.util.Scanner;

public class BasicCalci {
	public static void main(String[] args) {
		int total;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Number 1: ");
		int num1 = in.nextInt();
		
		System.out.print("Enter Operator: ");
		char op = in.next().charAt(0);
		
		System.out.print("Enter Number 1: ");
		int num2 = in.nextInt();
		
		if(op=='+') {
			System.out.println(num1+num2);
		}
		else if(op=='-') {
			System.out.println(num1-num2);
		}
		else if(op=='*') {
			System.out.println(num1*num2);
		}
		else if(op=='/') {
			System.out.println(num1/num2);
		}
		else if(op=='%') {
			System.out.println(num1%num2);
		}
		else {
			System.out.println("Something Wrong.");
		}
	}
}
