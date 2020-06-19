import java.util.Scanner;
class Main5
{
	static int rev_num(int n)
	{
		int rev=0;
		while(n>0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		return rev;
	}
	public static void main(String[] args)
	{
		Scanner read=new Scanner(System.in);
		System.out.println("enter your number");
		int ran=read.nextInt();
		int count=0;
		for(int num=1;num<=ran;num++)
		{
			int rev=rev_num(num);
			if(num==rev)
				count=count+num;	
		}
		System.out.println("sum of palindromes between 1 to "+ran+"is:"+count);
	}
}