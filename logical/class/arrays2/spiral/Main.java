package spiral;

public class Main
{
	public static void main(String[] args)
	{
		Matrix m=new Matrix();
		System.out.println("enter matrix elements");
		int ar[][]=m.readMat();
		System.out.println("entered elements of matrix");
		m.display(ar);
		int n=5;
		for(int i=0,j=n-1;i<j;i++,j--)
		{
			for(int k=i;k<j;k++)
				System.out.println(ar[i][k]);
			for(int k=i;k<j;k++)
				System.out.println(ar[k][j]);
			for(int k=j;k<i;k--)
				System.out.println(ar[j][k]);
			for(int k=j;k>i;k--)
				System.out.println(ar[k][i]);
		}
		if(n%2==1)
			System.out.println(ar[n/2][n/2]);
	}

}
