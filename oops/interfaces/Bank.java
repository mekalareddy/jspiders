import java.util.Scanner;
interface Account
{
	void deposit();
	void withdrawl();
	void checkbalance();
}
class Savings implements Account
{
	double bal=1000;
	public void deposit(double amt)
	{
		System.out.println("deposited amount is"+amt);
		bal=bal+amt;
		System.out.println("final amount is"+bal);
	}
	public void withdrawl(double amt)
	{
		System.out.println("withdrawl amount is"+amt);
		bal=bal-amt;
		System.out.println("final amount is"+bal);
	}
	public void checkbalance()
	{
		System.out.println("balance amount is"+bal);
	}	
}
class Loan implements Account
{
	double bal=-1000;
	public void deposit(double amt)
	{
		System.out.println("deposited amount is"+amt);
		bal=bal+amt;
		System.out.println("final amount is"+bal);
	}
	public void withdrawl(double amt)
	{
		System.out.println("withdrawl amount is"+amt);
		bal=bal-amt;
		System.out.println("final amount is"+bal);
	}
	public void checkbalance()
	{
		System.out.println("balance amount is"+bal);
	}	
}
class AccDB
{
	Account getAccount(char accType)
	{
		Account acc1=null;
		if(accType=='s')
		{
			acc1=new Savings(543213,25000.00);
		}
		else if(accType=='l')
		{
			acc1=new Loan(515601,50000.00);
		}
		return acc1;
	} 
}
class Bank
{
	public static void main(String[] args)
	{
		Scanner read=new Scanner(System.in);
		System.out.println("enter amount to account");
		double amt=read.nextDouble();
		AccDB db1=new AccDB();
		Account s1=db1.getAccount('l');
		s1.checkbalance();
		s1.deposit(amt);
		s1.checkbalance();
		s1.withdrawl(amt);
		s1.checkbalance();
		Account l1;
		l1=new Loan();
		l1.checkbalance();
		l1.deposit(amt);
		l1.checkbalance();
		l1.withdrawl(amt);
		l1.checkbalance();
	}
}