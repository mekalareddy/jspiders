//TO REVERSE THE SENTENCE
import java.util.Scanner;
class Main19
{
	public static void main(String[] args)
	{
		System.out.print("Enter the sentence:");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		st="";
		for(int i=ch.length-1;i>=0;i--)
		{	
			int k=i;
			while(i>=0&&ch[i]!=' '&&ch[i]!='.'&&ch[i]!=',')
			{
				i--;
			}
			int j=i+1;
			while(j<=k)
			{
				st=st+ch[j];
				j++;
			}
			if(i>=0)
			{
				st=st+ch[i];
			}
		} 
		System.out.println("reversed sentence is:"+st);
	}
}