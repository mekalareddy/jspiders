import java.util.Scanner;
class Main1
{
	public static void main(String[] args)
	{
		Scanner read=new Scanner(System.in);
		System.out.println("enter your number");
		int eno=read.nextInt();
		int i=1;
		int sum=0;
		while(i<=eno/2)
		{
			if(eno%i==0)
				sum=sum+i;
			i++;
		}
		if(sum==eno)
			System.out.println("numberis a perfect");
		else
			System.out.println("number is not perfect");
	}
}