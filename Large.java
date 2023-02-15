import java.util.Scanner;
public class Large {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int a = in.nextInt();
		
		System.out.println("Enter Number: ");
		int b = in.nextInt();
		
		System.out.println("Enter Number: ");
		int c = in.nextInt();
		
		if(a<b) {
			if(b<c) {
				System.out.println("c");
			}else {
				System.out.println("b");
			}
		}else if(a>b) {
			if(a>c) {
				System.out.println("a");
			}else {
				System.out.println("C");
			}
		}
	}

}
