package biggest;
public class Main4 
{
	public static void main(String[] args)
	{
		Matrix m=new Matrix();
		System.out.println("enter matrix elements");
		int ar[][]=m.readMat();
		System.out.println("entered elements of matrix");
		m.display(ar);
		int dsum=0;
		int tsum=0;
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				if((i==j)||(i+j==3))
				{
					dsum=ar[i][j];
					if(dsum<ar[i][j]&&count>0)
					{
						dsum=ar[i][j];
						count++;
					}
				}
				else if((i!=j)&&(i+j!=3))
				{
					tsum=ar[i][j];
					if(tsum<ar[i][j]&&count>0)
					{
						tsum=ar[i][j];
						count++;
					}
				}
			}
		}
		System.out.println("diagonal wise biggest element is:"+dsum);
		System.out.println("triangle wise biggest element is:"+tsum);		 
	}
}