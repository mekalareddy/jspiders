//TO COUNT NO OF OCCURENCE OF EACH CHARACTER IN THE GIVEN STRING
import java.util.Scanner;
class Main15
{
	public static void main(String[] args)
	{
		System.out.println("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		System.out.println("Entered String:"+st);
		char ch[]=st.toCharArray();
		int rs[]=new int[129];//AASCII value ends before this number.
		for(int i=0;i<ch.length;i++)
		{
			rs[ch[i]]++;
		}
		for(int i=1;i<rs.length;i++)
		{
			if(rs[i]>1)
				System.out.println((char)i+"---->"+rs[i]);
		}
	}
}