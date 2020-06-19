//TO COUNT NO OF WORDS IN A SENTENCE
import java.util.Scanner;
class Main20
{
	public static void main(String[] args)
	{
		System.out.print("Enter the sentence:");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		int count=1;
		for(int i=1;i<ch.length;i++)
		{	
			if((ch[i]==' '&&ch[i-1]!=' '&&ch[i-1]!=','&&ch[i-1]!='.')||
					(ch[i]==','&&ch[i-1]!=' '&&ch[i-1]!=','&&ch[i-1]!='.')||
					(ch[i]=='.'&&ch[i-1]!=' '&&ch[i-1]!=','&&ch[i-1]!='.'))
				count++;
		}
		if(ch[ch.length-1]==' ')
			count=count-1; 
		System.out.println("no of sentences is:"+count);
	}
}