class logic6
{
	public static void main(String[] args)
	{
		int n=7;
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
					System.out.print(k+" ");
					k++;
				}
				else
				{
					System.out.print("* ");
				}
				if(j<str/2)
					k++;
				else
					k--;
			}
			if(i<n/2)
			{
				spc--;
				str=str+2;
			}
			else
			{
				spc++; 
				str=str-2;
			}
			System.out.println();
		}
	}
}