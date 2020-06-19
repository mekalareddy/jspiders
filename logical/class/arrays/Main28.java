//TO FIND THE SUM OF DIGITS IN THE STRING
import java.util.Scanner;
class Main28
{
	public static void main(String[] args)
	{
		int sum=0;
		System.out.print("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=48&&ch[i]<=57)
			{
				sum=sum+(ch[i]-48);
			}
		}
		System.out.println("SUM OF DIGITS IN SENTENCE IS"+sum);
	}
}

