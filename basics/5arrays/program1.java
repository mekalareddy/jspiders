class program1
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
		System.out.println("a1[0] is"+a1[0]);
		System.out.println("a1[1] is"+a1[1]);
		System.out.println("a1[2] is"+a1[2]);
		System.out.println("a1[3] is"+a1[3]);
		System.out.println("a1[4] is"+a1[4]);
		System.out.println("..............");
		System.out.println("");
		for(int i=0;i<5;i++)
		{
			System.out.println("a1["+i+"]is"+a1[i]);
		}
		System.out.println("execution ended");
	}	
}

