class Pattern2
{
	public static void main(String[] args)
	{
		int n=5;
		int str=1;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=str;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			str=str+2;
		}
	}
}