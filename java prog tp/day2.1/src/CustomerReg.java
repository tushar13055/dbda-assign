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
public class CustomerReg {
	private String name;
	private String email;
	private int age;
	private double creditLimit;
	
	//below construtor is made by ide
//	public CustomerReg(String string, String string2, int i, int j) {
//		// TODO Auto-generated constructor stub
//	}
//cutom constrtor
	public CustomerReg(String name, String email, int age, double creditLimit) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.creditLimit = creditLimit;}

	public String info() {
		return name+" "+email+" "+age+ " "+creditLimit;
	}

	
	}


