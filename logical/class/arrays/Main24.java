//TO PRINT O/P AS 3abc3d2e3f WHEN WE GIVE I/P AS aaabcdddeefff
import java.util.Scanner;
class Main24
{
	public static void main(String[] args)
	{
		System.out.print("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		char ch[]=st.toCharArray();      
		st=" ";
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			while(i<ch.length-1&&ch[i]==ch[i+1])
			{
				count++;
				i++;
			}
			if(count>1)
				st=st+count;
			st=st+ch[i];
		}
		System.out.println("output is:"+st);
	}
}