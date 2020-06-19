import java.util.Scanner;
class Main2
{
	static int SumDigit(int n)
	{
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			sum=sum+(r*r);
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range");
		int ran=sc.nextInt();
		int count=0;
		int num;
		for(num=1;num<=ran;num++)
			while(num>9)
			{
				num=SumDigit(num);
			}
		if(num==1)
			System.out.println(num+"its a happy number...!");
		count=count+num;
		System.out.println("number of happy numbers between 1 to"+ran+"is"+count);
	}
}
