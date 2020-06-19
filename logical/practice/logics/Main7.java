import java.util.Scanner;
class Main7
{
	static boolean isprime(int n)
	{
		int i=2;
		while(i<=n/2)
		{
			System.out.println("num is dividing by"+i);
			if(n%i==0)
			{
				break;
			}
			System.out.println("i value"+i);
			i++;
		}
		System.out.println(i);
		/* if(i>n/2)
		return true;
		else
		return false;*/
		return i>n/2;
	}
	public static void main(String[] args)
	{
		Scanner read=new Scanner(System.in);
		System.out.println("enter your number");
		int num=read.nextInt();
		boolean res=isprime(num);
		if(res)
			System.out.println(num+"is a prime number");
		else
			System.out.println(num+"is not a prime number");
	}
}