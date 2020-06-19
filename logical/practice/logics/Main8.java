import java.util.Scanner;
class Main8
{
	static boolean isprime(int n)
	{
		int i=2;
		while(i<=n/2)
		{
			if(n%i==0)
			{
				break;
			}
			i++;
		}
		/* if(i>n/2)
		return true;
		else
		return false;*/
		return i>n/2;
	}
	public static void main(String[] args)
	{
		Scanner read=new Scanner(System.in);
		System.out.println("enter your range");
		int ran=read.nextInt();
		int count=0;
		for(int num=1;num<=ran;num++)
		{
			boolean res=isprime(num);
			if(res)
			{
				System.out.println(num);
				count++;
			}
		}
		System.out.println("no of prime numbers between 1 to "+ran+"is:"+count);
	}	
}