class demo1
{	
	static int x=10;
	static double y=1.2;
	static void test()
	{
		System.out.println("running test().....");
	}
}
class mainclass1
{	
	public static void main(String[] args)
	{
		System.out.println(demo1.x);
		System.out.println(demo1.y);
		demo1.test();
	}
}