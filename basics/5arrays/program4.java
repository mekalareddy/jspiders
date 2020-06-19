import java.util.Scanner;
class program4
{
	public static void main(String[] args)
	{
		System.out.println("program starts......");
		Scanner Scn = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = Scn.nextInt();
		int[] a1=new int[size];
		System.out.println("enter array elements");
		for(int i=0;i<size;i++)
		{
			a1[i]=Scn.nextInt();
		}  
		System.out.println("array elements are");
		for(int j=0;j<size;j++)
		{	
			System.out.println("a1["+j+"]->"+a1[j]);
		}
		System.out.println("program ended");
	}
}  
