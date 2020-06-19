import java.util.Scanner;
class Runclgapp
{
	public static void main(String[] args)
	{
		System.out.println("welcome to GATES");
		System.out.println("press 1 for new admission");

		Scanner read=new Scanner(System.in);
		int no = read.nextInt();
		if(no==1)
		{
			System.out.println("welcome to new admissions");
			System.out.println("press c for csdept admission");
			System.out.println("press e for ecdept admission");
			System.out.println("press m for mechdept admission");
			String alp = read.nextchar();
			System.out.println("enter stuudent name");
			String.name=read.next();
			System.out.println("enter mobile number");
			int phno = read.nextInt();
		}
		else
		{
			System.out.println("invalid input");
		}
	}
}