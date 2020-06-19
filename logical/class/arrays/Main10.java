//TO DELETE SPECIFIED ELEMENTS THROUGH INDEX
import java.util.Scanner;
class Main10
{
	static int[] readArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many values to enter");
		int n=sc.nextInt();
		int ele[]=new int[n];
		System.out.println("Enter "+n+" Elements");
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
		System.out.println("Enter array elements:");
		int a[]=readArray();
		System.out.println("Entered elements:");
		display(a);
		System.out.println("Enter the index to delete element");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b[]=delete(a,n);
		if(b==a)
		{
			System.out.println("enter correct index");
		}  
		else
		{
			System.out.println("After delete");
			display(b);
		}
	}
}