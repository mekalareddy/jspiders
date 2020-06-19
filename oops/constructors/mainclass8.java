import java.util.Scanner; 
class student
{
	String name; 	
	long phno;
	student(String name,long phno)
	{
		name=arg1;
		phno=arg2;	
	}
}  
public class Mainclass8
{
	public  static void main(String[] args)
	{
		System.out.println("program started");
		Scanner scn1=new Scanner(System.in);
		for(int i=1;i<=5;i++)
		{
			System.out.println("enter your name");
			String stuName=scn1.next();
			System.out.println("enter your phno");
			long stuPhno=scn1.nextlong();
			student st1=new student(stuName,stuPhno);
		}  
	}
}