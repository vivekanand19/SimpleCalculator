import java.util.Scanner;


public class Calc_app {
	
	static int res;

	public static void main(String[] args) {
		System.out.println("Enter 2 Numbers");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("a = "+a);

		int b = s.nextInt();
		System.out.println("b = "+b);
		
		
		System.out.println("Select the Operation");
		System.out.println("Enter 1 For Addition");
		System.out.println("Enter 2 For Subtraction");
		System.out.println("Enter 3 For Multiplication");
		System.out.println("Enter 4 For Division");

		int c = s.nextInt();
		
		switch(c) {
		
		
		case 1:
			res = a+b;
			System.out.println("result = " + res);
			break;
			
		case 2:
			res = a-b;
			System.out.println("result = " + res);
			break;
			
		case 3:
			res = a*b;
			System.out.println("result = " + res);
			break;
			
		case 4:
			res = a/b;
			System.out.println("result = " + res);
			break;
			
			
		default:
			System.out.println("Enter valid option");
			break;
				
		}

		

	}

}
