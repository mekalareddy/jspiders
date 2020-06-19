package transpose;

public class Main3 
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
	}

}
