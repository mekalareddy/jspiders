import java.util.Scanner;
class Main10
{	
	public static void main(String[] args)
	{
		int count=0;
		for(int i=0;i<=2016;i++)
		{
			if((i%4==0&&i%100!=0)||(i%400==0))
			{
				System.out.println("its a leapyear");
				count++;
			}
			System.out.println(count);
		}
	}
}