package reverse;

public class Column 
{
	public static void main(String[] args)
	{
		Matrix m=new Matrix();
		System.out.println("enter matrix elements");
		int a[][]=m.readMat();
		System.out.println("entered elements of matrix");
		m.display(a);
		for(int i=0;i<a.length/2;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				int t=a[i][j];
				a[i][j]=a[a.length-1-i][j];
				a[a.length-1-i][j]=t;
			}
		}
		System.out.println("reversed column elements:");
		m.display(a);
	}

}
