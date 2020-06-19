class demo
{
	int x=10;
	double y=0.1;
	void test( demo arg)
	{
		System.out.println("running test()....");
		System.out.println("x value is"+arg.x);
		System.out.println("y value is"+arg.y);
	}
}
class Sample
{
	void show(demo arg)
	{
		System.out.println("runnning show()....");
		System.out.println("x value is"+arg.x);
		System.out.println("y value is"+arg.y);
		arg.test();
		arg.x=1;
		arg.y=0.1;
	}
}
class Mainclass
{
	public static void main(String[] args)
	{
		Sample s1=new Sample();
		demo d1=new demo();
		s1.show(d1);
		System.out.println(d1.x);
		System.out.println(d1.y);
	}
}