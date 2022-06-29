package corejava.assignments.exception;

import java.util.Scanner;
class insufficientBalanceException extends Exception {

	
	public insufficientBalanceException(String message) {
		
		System.out.println(message);
	}

}

public class Bank  {
	long id;
	double balance;
	 double withdraw(double amount) throws insufficientBalanceException 
	{
		if(balance==0&&amount>0||balance<amount||amount<0)
		{
			throw  new insufficientBalanceException("insufficient Balance");
		}
		else
			return amount;
		
		
	}
	 double deposit(double amount)
	{
		this.balance=amount;
		return balance;
		
	}

	public static void main(String[] args) throws insufficientBalanceException  {
		
		Bank b=new Bank();
		Scanner sc = new Scanner(System.in);
		
		double a=sc.nextDouble();
		System.out.println(b.deposit(a));
		double c=sc.nextDouble();
		try
		{
		System.out.println(b.withdraw(c));
		}catch(insufficientBalanceException e)
		{
			System.out.println("insufficient Balance");
		}
		
	}

}

