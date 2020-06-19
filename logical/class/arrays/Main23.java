//TO DISPLAY DISTINCT AND COMMON ELEMENTS BETWEEN TWO ARRAYS
import java.util.Scanner;
class Main23
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
	public static void main(String[] args)
	{ 
		System.out.println("entered Array1:");
		int ar1[]=readArray();
		display(ar1);
		System.out.println("entered Array2:");
		int ar2[]=readArray();
		display(ar2);
		for(int i=0;i<ar1.length;i++)
		{
			for(int j=0;j<ar2.length;j++)
			{
				if(ar1[i]==ar2[j])
				{
					System.out.print(ar1[i]);
				}
				/* else
	 {
	   System.out.print(ar1[i]); 
	 }*/		 
			}
		}
	}
} 