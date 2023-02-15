import java.util.Scanner;

public class Tax {
	public static void main(String[] args) {
		int sal,tax,total;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Salary: ");
		sal = in.nextInt();
		
		if(sal>=100000) {
			tax=sal/100*20;
			System.out.println("Your tax is "+tax);
			
		}else if(sal<=100000 && sal>=10000) {
			tax=sal/100*10;
			System.out.println("Your tax is "+tax);
			
		}else {
			System.out.println("You have no need to pay tax.");
		}
	}
}