package row;
public class Main5 
{
	public static void main(String[] args)
	{
		Matrix m=new Matrix();
		System.out.println("enter matrix elements");
		int a[][]=m.readMat();
		System.out.println("entered elements of matrix");
		m.display(a);
		for(int i=0;i<a.length;i++)
		{
			int rbig=a[i][0];
			for(int j=0;j<a.length;j++)
			{
				if(rbig<a[i][j])
					rbig=a[i][j];
			}
			System.out.println(i+1+"row biggest element:"+rbig);	
		}
	}

}
