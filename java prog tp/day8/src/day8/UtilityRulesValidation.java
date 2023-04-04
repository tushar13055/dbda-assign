//public static final int MIN_BALANCE = 1000;
//	public static final String[] ACCT_TYPE = new String[] {"SAVINGS", "CURRENT","LOAN","FD"}; 
//
//	public static boolean checkBalance(double balance)
//	
//	public static boolean checkNegativeBalance(double balance)
//	public static boolean checkAcctType(String acctType)
package day8;

public class UtilityRulesValidation {
	public static final int MIN_BALANCE =1000;
	public static final String[] ACCT_TYPE =new String[] {"STRINGS","CURRENT","LOAN","FD"};	
	
	
	
	
	
	public static boolean checkNegativeBalance(double balance) {
		boolean neg_balance_flag=false;
		if(balance<0) {
			neg_balance_flag=true;
		}
		return neg_balance_flag;
		
	}
	public static boolean checkAcctType(String acctType) {
		for(String i:ACCT_TYPE)
		{
			if(i.equals(acctType)) {
				return true;
				
			}
		}
		return false;
	}


	public static boolean checkBalance(double balance) {
		// TODO Auto-generated method stub
		boolean min_balance_flag=false;
		if(balance>MIN_BALANCE) {
			min_balance_flag=true;	
		}
		
		return min_balance_flag;
	}
}
