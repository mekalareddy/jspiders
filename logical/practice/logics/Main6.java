import java.util.Scanner;
class Main6
{
	static int fact(int n)
	{
		int f=1;
		while(n>0)
		{
			f=f*n;
			n--;
		}
		return f;
	}
	static boolean isstrong(int n)
	{
		int t=n;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			sum=sum+fact(r);
			n=n/10;
		}
		if(t==sum)
			return true;
		else
			return false;
		//return t==sum;
	}
	public static void main(String[] args)
	{
		Scanner read=new Scanner(System.in);
		System.out.println("enter your number");
		int num=read.nextInt();
		boolean res=isstrong(num);
		if(res)
			System.out.println("its a strong number");
		else
			System.out.println("its not a strong number");
	}
}