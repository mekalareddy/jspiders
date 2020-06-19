import java.util.Scanner;
class count
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.next();
		System.out.println("entered string is "+st);
		char ch[]=st.toCharArray();
		int rs[]=new int[129];
		for(int i=0;i<ch.length;i++)
		{
			rs[ch[i]]++;
		}
		for(int i=1;i<rs.length;i++)
		{
			if(rs[i]>0)
				System.out.println((char)i+"----->"+rs[i]);
		}
	}
}