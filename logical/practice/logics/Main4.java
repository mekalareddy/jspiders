import java.util.Scanner;
class Main4
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
		int num=read.nextInt();
		int rev=rev_num(num);
		System.out.println("entered numbered is:"+num);
		System.out.println("reversed number is:"+rev);
	}
}