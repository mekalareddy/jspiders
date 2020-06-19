package mytasks;

public class Main2 
{
	public static void main(String[] args)
	{
		Matrix m=new Matrix();
		System.out.println("enter 1st matrix elements");
		int a[][]=m.readMat();
		System.out.println("enter 2nd matrix elements");
		int b[][]=m.readMat();
		System.out.println("entered elements of matrix1");
		m.display(a);
		System.out.println("entered elements of matrix2");
		m.display(b);
		int re[][]=m.mul(a,b);
		if(re!=null)
		{
			System.out.println("multiplied matrix elements");
			m.display(re);
		}
		int res[][]=m.add(a,b);
		if(res!=null)
		{
			System.out.println("added matrix elements");
			m.display(res);
			return;
		}
		System.out.println("not possible to add");
	}

}
