//TO FIND SUM OF ODD NUMBERS AND EVEN NUMBERS FROM 'N' NUMBER OF ELEMENTS
import java.util.Scanner;
class Main3
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
		int[] ar;
		ar=readArray();
		System.out.println("Entered Array");
		display(ar);
		int esum=0;
		int osum=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
				esum+=ar[i];//esum=esum+ar[i];
			else
				osum+=ar[i];//osum=osum+ar[i];
		}
		System.out.println("sum of even no:"+esum);
		System.out.println("sum of odd no:"+osum);
	}
} 