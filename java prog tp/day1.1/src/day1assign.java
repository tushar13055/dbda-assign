import java.util.Scanner;

//Mandatory assignment
//The java program should run till user enters "quit" or any other option than add or sub or mult or div.
//Prompt user to enter the input operation : (add|sub|mult|div) & 2 numbers(double)
//Display the result of the operation.
//Use Scanner for accepting all inputs from user. 
//Hint : use switch-case
public class day1assign {
	static void myMethod() {
		System.out.println("I just got executed!");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		myMethod();

		boolean exit = true;
		while (exit) {
			System.out.println("enter number1");
			int a = sc.nextInt();

			System.out.println("enter number2");
			int b = sc.nextInt();
			System.out.println("enter operation +,-,/,*,q for exit");
			String key1 = sc.next();
			double ans;

			switch (key1) {
			case "+":
				ans = a + b;
				System.out.println(ans);
				break;
			case "-":
				ans = a - b;
				System.out.println(ans);

				break;
			case "*":
				ans = a * b;
				System.out.println(ans);
				break;
			case "/":
				ans = a / b;
				System.out.println(ans);
				break;
			case "q":
				exit = false;
				break;

			default:
				break;
			}
		}

	}

}
