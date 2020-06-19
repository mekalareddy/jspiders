//TO DISPLAY MISSING ELEMENTS IN SORTED ARRAY
import java.util.Scanner;
class Main14
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
		System.out.println("Enter any sorted elements:");
		Scanner sc=new Scanner(System.in);
		int a[]=readArray();
		System.out.println("Entered elements:");
		display(a);
		System.out.println("Missing Elements:");
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=a[i]+1;j<a[i+1];j++)
			{
				System.out.print(j+",");
			}
		}
	}
}