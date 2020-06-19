//TO FIND WHICH WORD CONTAINING MORE NO OF VOWELS IN A SENTENCE
import java.util.Scanner;
class Main29
{
	public static void main(String[] args)
	{
		System.out.print("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		int vc=0;
		String vw=" ";
		for(int i=0;i<ch.length;i++)
		{	  
			int c=0;
			String w=" ";
			while(i<ch.length&&ch[i]!=' ')
			{

				if(ch[i]=='a'||ch[i]=='A'||ch[i]=='e'||ch[i]=='E'||
						ch[i]=='i'||ch[i]=='I'||ch[i]=='o'||ch[i]=='O'||
						ch[i]=='u'||ch[i]=='U')
				{
					c++;
				}
				w=w+ch[i];		
				i++;
			}
			if(vc<c)
			{
				vc=c;
				vw=w;
			}	
		}
		System.out.println(vw+" contains "+vc+"(max) vowels in given sentence");
	}
}  

