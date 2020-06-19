//TO CHECK SUBSTRING IS PRESENT IN THE MAIN STRING OR NOT
import java.util.Scanner;
class Main25
{
	static boolean checksub(String st,String sb)
	{
		char mc[]=st.toCharArray();
		char sc[]=sb.toCharArray();
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
				return true;
		}
		return false;
	}
	public static void main(String[] args)
	{
		boolean res=checksub("jspiders","ers");
		if(res)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}