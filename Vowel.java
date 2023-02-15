import java.util.Scanner;

public class Vowel {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Character: ");
		char ch = in.next().charAt(0);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			System.out.println("Letter is a Vowel "+ch);
		}else {
			System.out.println("Consonent");
		}
	}

}
