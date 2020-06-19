package reverse;

public class Main7 
{

	public static void main(String[] args)
	{
		Matrix m=new Matrix();
		System.out.println("enter matrix elements");
		int a[][]=m.readMat();
		System.out.println("entered elements of matrix");
		m.display(a);
		int n=4;
		for(int i=0;i<n/2;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					int t=a[i][j];
					a[i][j]=a[n-1-i][n-1-j];
					a[n-1-i][n-1-j]=t;
				}
				if(i+j==n-1)
				{
					int t=a[i][j];
					a[i][j]=a[j][i];
					a[j][i]=t;
				}
			}
		}
		System.out.println("reversed diagonal elements:");
		m.display(a);
	}

}
