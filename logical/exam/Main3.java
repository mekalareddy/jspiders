import java.util.Scanner;
class Main3
{
	static int pow(int n,int p)
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		String num=sc.next();
		int count=0,sum=0;
		for(int i=num.length()-1;i>=0;i--)
		{
			char ch=num.charAt(i);
			if(ch>65&&ch<=90)
			{
				sum=sum+(ch-55)*pow(16,count);
			}
			else if(ch>97&&ch<=122)
			{
				sum=sum+(ch-87)*pow(16,count);
			}
			else
			{
				sum=sum+(ch-48)*pow(16,count);
			}
			count++;
		}
		System.out.println(sum);
	}
}