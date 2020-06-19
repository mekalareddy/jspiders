import java.util.Scanner;
class program3
{
	public static void main(String[] args)
	{
		System.out.println("program starts......");
		Scanner Scn = new Scanner(System.in);
		System.out.println("please enter integer value");
		int input = Scn.nextInt();
		System.out.println("value entered by user is"+input);
		System.out.println("please enter the message");
		String message=Scn.next();
		System.out.println("message is"+message);
		System.out.println("program ended");
	}
}  

