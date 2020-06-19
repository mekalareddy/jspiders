package bochu;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args, char[] s1, char[] s2, char[] s3, char[] s4, char[] s5) 
	{
		System.out.println("enter type of sale");
		System.out.println("press 1 for air");
		System.out.println("press 2 for land");
		System.out.println("press 3 for fire");
		System.out.println("press 4 for water");
		System.out.println("press 5 for sky");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("remaining balace");
		switch(num)
		{
		case 1:Shop s11=new Shop(num);
		System.out.println(s11);
		break;
		case 2:Shop s21=new Shop(num);
		System.out.println(s21);
		break;
		case 3:Shop s31=new Shop(num);
		System.out.println(s31);
		break;			
		case 4:Shop s41=new Shop(num);
		System.out.println(s41);
		break;		
		case 5:Shop s51=new Shop(num);
		System.out.println(s51);
		break;
		default:System.out.println("invalid entry");
		}
	}

}
