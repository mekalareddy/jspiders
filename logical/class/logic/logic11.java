class logic11
{
	public static void main(String[] args)
	{
		int n=6;
		char ch='A';
		for(int i=0;i<n;i++)
		{ 
			char c=ch;
			for(int j=0;j<=i;j++)
			{
				System.out.print(c+" ");	
				c++;		
			}
			System.out.println();
			ch++;
		}

	}	
}