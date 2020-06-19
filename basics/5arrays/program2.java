class program2
{
	public static void main(String[] args)
	{
		System.out.println("program starts......");
		int[] a1=new int[5];
		a1[0]=100;
		a1[1]=200;
		a1[2]=300;
		a1[3]=400;
		a1[4]=500;
		for(int i=4;i>=0;i--)
		{
			System.out.println("a1["+i+"]is"+a1[i]);
		}
		System.out.println("execution ended");
	}	
}

