// TO CHECK TWO STRINGS ARE ANAGRAM OR NOT
import java.util.Scanner;
class Main21
{
	static String remspc(String st)
	{
		char ch[]=st.toCharArray();
		st="";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
				st=st+ch[i];
		}
		return st;
	}
	static String toLower(String st)
	{
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=65&&ch[i]<=90)
				ch[i]=(char)(ch[i]+32);
		}
		st=new String(ch);
		return st;
	}
	static String sort(String st)
	{
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length-1;i++)
		{ 
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					char c=ch[i];
					ch[i]=ch[j];
					ch[j]=c;
				}
			}
		}
		st=new String(ch);
		return st;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st string");
		String st1=sc.nextLine();
		System.out.println("Enter 2nd string");
		String st2=sc.nextLine();
		st1=remspc(st1);
		st1=remspc(st2);
		if(st1.length()!=st2.length())
		{
			System.out.println("Strings are not Anagram");
			return;
		}
		st1=toLower(st1);
		st2=toLower(st2);
		st1=sort(st1);
		st1=sort(st2);
		char c1[]=st1.toCharArray();
		char c2[]=st1.toCharArray();
		for(int i=0;i<c1.length;i++)
		{
			if(c1[i]!=c2[i])
			{
				System.out.println("Strings are not ANAGRAM");
				return;
			}
		}
		System.out.println("Strings are ANAGRAM"); 
	}
}