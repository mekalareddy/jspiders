//TO FIND FIRST,SECOND BIGGEST ELEMENTS FROM ENTERED ARRAY
import java.util.Scanner;
class Main4
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
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]>=fbig)
			{
				sbig=fbig;
				fbig=ar[i];
			}
			else if(ar[i]>=sbig)
			{
				sbig=ar[i];
			}
		}
		System.out.println("first biggest:"+fbig);
		System.out.println("second biggest:"+sbig);
	}
}