package day8;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter max account number");
		BankAccount[] ba= new BankAccount[(sc.nextInt())];
		boolean exit=true;
		int counter =0;
		while(!exit) {
			System.out.println(" 1 create account 2 withdrawal 3 check balance 0 exit");
			
			
			switch (sc.nextInt()) {
			case 1:
			{
				if(counter<=ba.length) {
				//int acct_number, String customer_name, String account_type, double balance
					ba[counter++]=new BankAccount(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
					System.out.println("ACCOUNT CRETED SUCCESFULLY");
					
				}
				else {
						throw new RuntimeException(" account is full ");
				break;
			}}
			case 2:
			{
				System.out.println("enter amount to withdraw");
				double amtwithdraw=sc.nextDouble();
				System.out.println("enter account no");
				int tempacno=sc.nextInt();
				//BankAccount tmpbnk= new BankAccount(tempacno);
				for(BankAccount tmp:ba)
					if(tmp!=null)
						if(tmp.getAcct_number() == tempacno) {
							throw new RuntimeException("less balace dcsdferv ");
						}

				break;
			}}
		}
		
	}

}
