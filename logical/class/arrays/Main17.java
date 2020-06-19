//TO FIND NO OF VOWELS,CONSONENTS AND DIGITS
import java.util.Scanner;
class Main17
{
	public static void main(String[] args)
	{
		System.out.println("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		System.out.println("Entered String:"+st);
		char ch[]=st.toCharArray();
		int VC=0,CC=0,DC=0,SC=0;
		for(int i=0;i<ch.length;i++)
		{	
			if((ch[i]>=65&&ch[i]<=90)||(ch[i]>=97&&ch[i]<=122))
			{
				if(ch[i]=='A'||ch[i]=='a'||ch[i]=='E'||ch[i]=='e'||ch[i]=='I'||ch[i]=='i'||ch[i]=='O'||ch[i]=='o'||ch[i]=='U'||ch[i]=='u')
					VC++;
				else
					CC++;	
			}
			else
			{
				if(ch[i]>=48&&ch[i]<=57)
					DC++;
				else
					SC++;	
			}
		} 
		System.out.println("no of vowels is:"+VC);
		System.out.println("no of consonents is:"+CC);
		System.out.println("no of digits is:"+DC);
		System.out.println("no of symbols is:"+SC);
	}
}