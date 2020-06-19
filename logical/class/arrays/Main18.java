//TO REVERSE WORDS IN A SENTENCE
import java.util.Scanner;
class Main18
{
	public static void main(String[] args)
	{
		System.out.print("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		st="";
		for(int i=0;i<ch.length;i++)
		{	
			int k=i;
			while(i<ch.length&&ch[i]!=' '&&ch[i]!='.'&&ch[i]!=',')
			{
				i++;
			}
			int j=i-1;
			while(j>=k)
			{
				st=st+ch[j];
				j--;
			}
			if(i<ch.length)
			{
				st=st+ch[i];
			}
		} 
		System.out.println("reversed words in a sentence is:"+st);
	}
}