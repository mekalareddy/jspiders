class Pattern9
{
	public static void main(String[] args)
	{
		int n=5;
		int spc=n/2;
		int str=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<spc;j++)
			{
				System.out.print(" ");
			}
			int k=1;   
			for(int j=0;j<str;j++)
			{
				if(j%2==0)
				{
					System.out.print(k+"");	
					k++;
				}
				else
				{	
					System.out.print("*");
				}
			}
			if(i<n/2)
			{
				str=str+2;
				spc--;
			}
			else
			{ 
				str=str-2;
				spc++;
			}
			System.out.println();
		}
	}
}