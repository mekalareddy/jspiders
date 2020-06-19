//TO INTERCHANGE CONTINUOUS VOWELS IN A STRING
import java.util.Scanner;
class Main16
{
	public static void main(String[] args)
	{
		System.out.println("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		System.out.println("Entered String:"+st);
		char ch[]=st.toCharArray();
		int k=-1;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				if(k==-1)
				{
					k=i;
				}
				else
				{
					char c=ch[i];
					ch[i]=ch[k];
					ch[k]=c;
					k=-1;
				}
			} 
		}
		st=new String(ch);
		System.out.println("After interchanging continuous vowels:"+st);
	}
}
