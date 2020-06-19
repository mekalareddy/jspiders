//TO CHECK HOW MANY TIMES A SUBSTRING IS PRESENT IN MAIN STRING
import java.util.Scanner;
class Main26
{
	static int checksub(String st,String sb)
	{
		char mc[]=st.toCharArray();
		char sc[]=sb.toCharArray();
		int count=0;
		for(int i=0;i<mc.length;i++)
		{
			int k=i;
			int j=0;
			while(k<mc.length&&j<sc.length&&mc[k]==sc[j])
			{
				k++;
				j++;
			}
			if(j==sc.length)
				count++;
		}
		return count;
	}
	public static void main(String[] args)
	{
		int res=checksub("jspiders","spi");
		if(res>0)
			System.out.println("yes it present "+res+" times");
		else
			System.out.println("no");
	}
}