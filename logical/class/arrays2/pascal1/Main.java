package pascal1;
public class Main
{
	public static void main(String[] args)
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=n-1;j>1;j--)
			{
				System.out.print(" ");
			}
			int num=1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(num+" ");
				num=num*(i-j)/(j+1);
			}
			System.out.println();
		}
	}
}