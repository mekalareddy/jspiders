//TO FIND FIRST,SECOND,THIRD BIGGEST ELEMENTS FROM ENTERED ARRAY
import java.util.Scanner;
class Main5
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
		System.out.println("Entered array");
		display(ar);
		int fbig=ar[0];
		int sbig=ar[1];
		int tbig=ar[2];
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]>=fbig)
			{
				tbig=sbig;
				sbig=fbig;
				fbig=ar[i];
			}
			else if(ar[i]>=sbig)
			{
				tbig=sbig;
				sbig=ar[i];
			}
			else if(ar[i]>=tbig)
			{
				tbig=ar[i];
			}
		}
		System.out.println("first biggest:"+fbig);
		System.out.println("second biggest:"+sbig);
		System.out.println("third biggest:"+tbig);
	}
}