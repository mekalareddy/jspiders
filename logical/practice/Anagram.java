import java.util.Scanner;
class Anagram
{
	static String remspc(String st)
	{
		char ch[]=st.toCharArray();
		String St=" ";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
				St=St+ch[i];
		}
		return St;
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
		System.out.println("enter 1st Array");
		String s1=sc.next();
		System.out.println("enter 2nd Array");
		String s2=sc.next();
		String st1=remspc(s1);
		String st2=remspc(s2);
		if(st1.length()!=st2.length())
		{
			System.out.println("strings are not anagram");
			return;
		}
		st1=toLower(st1);
		st2=toLower(st2);
		st1=sort(st1);
		st2=sort(st2);
		char c1[]=st1.toCharArray();
		char c2[]=st2.toCharArray();
		for(int i=0;i<c1.length;i++)
		{
			if(c1[i]!=c2[i])
			{
				System.out.println("strings are not anagram");
				return;
			}
		}
		System.out.println("strings are anagram");
	}
}