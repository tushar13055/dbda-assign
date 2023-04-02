//
//9. Find the compound interest n the amount 
//Accept principle , interest rate n time period in years from user , using scanner.
//Formula : 
//Compound Interest=Principle*(1+(rate / 100))^time – Principle
//time : time period in years.
import java.lang.*;
public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p=50000;
		double i=8;
		double n=10;
		double interest_earned = 0.0;
		interest_earned= p * ((Math.pow((1 + (i / 100)), n)));
		System.out.println(interest_earned);

	}

}
