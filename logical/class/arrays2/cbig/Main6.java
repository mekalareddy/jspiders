package cbig;
public class Main6 
{

	public static void main(String[] args)
	{
		Matrix m=new Matrix();
		System.out.println("enter matrix elements");
		int a[][]=m.readMat();
		System.out.println("entered elements of matrix");
		m.display(a);
		for(int i=0;i<a[0].length;i++)
		{
			int cbig=a[0][i];
			for(int j=1;j<a.length;j++)
			{
				if(cbig<a[j][i])
					cbig=a[j][i];
			}
			System.out.println(i+1+"column biggest element:"+cbig);
		}
	}

}
