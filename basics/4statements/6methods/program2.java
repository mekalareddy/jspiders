class program2
{
	static void test()
	{
		System.out.println("running test()method.....");
		disp();//call disp method
	}
	public static void main(String[] args)
	{
		System.out.println("execution started");
		test();//call test method
		System.out.println("execution ended");
	}
	static void disp()
	{
		System.out.println("running disp()method.....");
	} 
}

