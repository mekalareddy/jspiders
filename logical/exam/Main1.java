import java.util.Scanner;
class Main1
{
	public static void main(String[] args)
	{
		Scanner read=new Scanner(System.in);
		System.out.println("enter your range");
		int ran=read.nextInt();
		for(int num=1;num<=ran;num++)
		{
			if(num%1!=0&&num%num!=0)
			{
				System.out.println(num+"is a prime number");
			}
			else if(num%1!=0&&num%num!=0)
			{
				System.out.println(num+"is not a prime number");	
			}
			//System.out.println("sum of not prime numbers between 1 to "+ran+"is:"+count);
		}	
	} 
}