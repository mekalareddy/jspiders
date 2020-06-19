package rotate;

public class Right90
{

	public static void main(String[] args) 
	{
		Matrix m=new Matrix();
		System.out.println("enter matrix elements");
		int a[][]=m.readMat();
		System.out.println("entered elements of matrix");
		m.display(a);
		System.out.println("after transpose");
		a=m.transpose(a);
		m.display(a);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length/2;j++)
			{
				int t=a[i][j];
				a[i][j]=a[i][a[i].length-1-j];
				a[i][a[i].length-1-j]=t;
			}
		}
		System.out.println("reversed row elements:");
		m.display(a);
	}

}
