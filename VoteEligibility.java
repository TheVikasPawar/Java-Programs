import java.util.Scanner;
public class VoteEligibility {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Your Age: ");
		int age = in.nextInt();
		
		if(age>=18) {
			System.out.println("You are eligible for voting.");
		}
		else
		{
			System.out.println("You are not eligible for vote");
		}
	}

}
