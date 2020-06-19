//TO INTERCHANGE THE FIRST AND LAST CHARACTER OF EVERY WORD IN SENTENCE
import java.util.Scanner;
class Main27
{
	public static void main(String[] args)
	{
		System.out.print("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		int k=0;
		for(int i=0;i<ch.length;i++)
		{
			if(i==0||ch[i]!=' '&&ch[i-1]==' ')
			{		
				k=i;
			}	
			if((i<ch.length-1&&ch[i]!=' '&&ch[i+1]==' ')||i==ch.length-1)
			{
				char c=ch[i];
				ch[i]=ch[k];
				ch[k]=c;
			}
			st=new String(ch);
		}
		System.out.println("output string is:"+st);
	}
}

