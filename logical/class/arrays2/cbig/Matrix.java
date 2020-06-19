package cbig;
import java.util.Scanner;
public class Matrix 
{
	int[][] readMat()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows");
		int m=sc.nextInt();
		System.out.println("enter no of columns");
		int n=sc.nextInt();
		int ar[][]=new int[m][n];
		System.out.println("enter "+m*n+" elements");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		return ar;
	}
	void display(int ar[][])
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}
}
