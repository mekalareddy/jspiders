//TO PRINT CHARACTERS IN SORTED MANNER WITHOUT COMPARING EACH OTHER
import java.util.Scanner;
class Main22
{
	public static void main(String[] args)
	{
		System.out.print("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		char ch[]=st.toCharArray();      
		int rs[]=new int[129];
		for(int i=0;i<ch.length;i++)
		{
			rs[ch[i]]++;
		}
		System.out.print("sorted characters are:");
		for(int i=0;i<rs.length;i++)
		{
			while(rs[i]>0)
			{
				System.out.print((char)i);
				rs[i]--;
			}
		}
	}
}