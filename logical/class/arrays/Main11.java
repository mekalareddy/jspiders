//TO DISPLAY MISSING,UNIQUE,DUPLICATE ELEMENTS BETWEEN RANGE
import java.util.Scanner;
class Main11
{
	static int[] readArray()
	{
		Scanner sc=new Scanner(System.in);
		int ele[]=new int[7];
		for(int i=0;i<ele.length;i++)
		{   
			ele[i]=sc.nextInt();
		}
		return ele;
	}
	static void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		System.out.println("Enter any elements between 0 to 9");
		Scanner sc=new Scanner(System.in);
		int a[]=readArray();
		System.out.println("Entered elements:");
		display(a);
		int res[]=new int[10];
		for(int i=0;i<a.length;i++)
		{
			res[a[i]]++;
		}
		System.out.println("press 2 to find duplicate elements");
		System.out.println("press 1 to find unique elements");
		System.out.println("press 0 to find missing elements");
		int p=sc.nextInt();
		for(int i=0;i<res.length;i++)
		{	
			if(p==0)
			{
				if(res[i]==0)
				{
					System.out.print(i+",");
				}
			}
			else if(p==1)
			{ 
				if(res[i]==1)
				{
					System.out.print(i+",");
				}
			}
			else if(p==2)
			{	 
				if(res[i]>1)
				{
					System.out.print(i+",");
				}
			}
		}
	}
}
