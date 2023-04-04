package day8;

//3.1 Every Bank Account must have acct number(int) , customer name(string), account type (string) , account balance(double)
//Unique ID of bank account is : account no.
//Override equals method (with the help of lab faculty) , to replace ref. equality by acct no equality.: MUST be done.
//Add withdraw n deposit methods in the bank account.
//3.2 ValidationRules
//1. account balance > min balance
//2. account type can be either : SAVING | CHECKING | LOAN | FD 
//Add validation methods . In case of failures , throw the custom exception.
//
//3.3 Create Tester application : TestBanking
//1.Use try-with-resources for creating scanner.
//2. Accept  inputs for creating new account. 
//i/ps : acct number,customer name, account type  , account balance
//Validate inputs . In case of success , create the account n display it's details using toString (of BankAccount)
//In case of failure , display error message , using catch-all
//(centralized exc handling)
//Create 2 accounts (at least)
//3. Use equals method , to check if they are same or different.
//4. Test withdraw n deposit methods.

public class BankAccount {
	private int acct_number;
	private String customer_name;
	private String account_type;
	private double balance;
	public BankAccount(int acct_number, String customer_name, String account_type, double balance)
			throws InvalidAccountDetailsException{
		

		if (!UtilityRulesValidation.checkBalance(balance))
			throw new InvalidAccountDetailsException("Invalid balance");
		if (!UtilityRulesValidation.checkAcctType(account_type))
			throw new InvalidAccountDetailsException("invlid acct type :");;
	
	
		this.acct_number = acct_number;
		this.customer_name = customer_name;
		this.account_type = account_type;
		this.balance = balance;
	}	
	
	public BankAccount(int acct_number) {
		super();
		this.acct_number = acct_number;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		return acct_number == other.acct_number;
	}

	public int getAcct_number() {
		return acct_number;
	}

	public void setAcct_number(int acct_number) {
		this.acct_number = acct_number;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
public void withdraw(int withdrawbal) {
//	double temp = this.balance - withdrawBal;
//	if (UtilityRulesValidation.checkBalance(temp)) {
//		this.balance = temp;
	 balance=balance-withdrawbal;
	System.out.println("withdraw balance is"+balance);
}

@Override
public String toString() {
	return "BankAccount [acct_number=" + acct_number + ", customer_name=" + customer_name + ", account_type="
			+ account_type + ", balance=" + balance + "]";
}

}
