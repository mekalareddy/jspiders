//TO REMOVE DUPLICATES FROM THE ARRAY
import java.util.Scanner;
class Main12
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
	static int[] delete(int ar[],int in)
	{
		if(in<0||in>=ar.length)
		{
			System.out.println("index out of bound");
			return ar;
		}
		int res[]=new int[ar.length-1];
		for(int i=0;i<res.length;i++)
		{
			if(i<in)
			{
				res[i]=ar[i];
			}
			else
			{
				res[i]=ar[i+1];
			}
		}
		return res;
	}
	public static void main(String[] args)
	{
		System.out.println("Enter any elements between 0 to 9");
		Scanner sc=new Scanner(System.in);
		int a[]=readArray();
		System.out.println("Entered elements:");
		display(a);
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a=delete(a,j);
					//j--;
				}
			}
		}
		System.out.println("After deleting duplicate elements:");
		display(a);
	}
}