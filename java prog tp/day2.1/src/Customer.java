//Create a java application for the following.
//
//3.1 Create a Customer class , with data members (all private : tight encapsulation)
//name(String),email(String),age(int), creditLimit(double)
//
//Do not supply any constructor first(this is to confirm a default constructor)
//Add a method to return all customer details , in a string .
//
//3.2 Create RegisterCustomer class with main method
//Create a customer class instance , using default constructor.
//Display customer details.
//Observe n conclude.
//
//3.3 Now add a parameterized constructor to the  Customer class
//
//3.4 Create RegisterCustomer2 class with main method
//Accept customer details from user using scanner.
//Display customer details.

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerReg c1=new CustomerReg("tushar","dontspamme@nomail.com",22,143143);
		System.out.println(c1.info());
		CustomerReg c2=new CustomerReg("tushar","dontspamme@nomail.com",22,143143);//user 
		System.out.println(c2info());
	}

}
