class demo1
{
	int x=10;
	double y=4.5;
	void test()
	{
		System.out.println("running test().....");
	}
}
class Sample1
{
	void display(demo1 arg)
	{
		System.out.println("running display() method.....");
		System.out.println("x value"+arg.x);
		System.out.println("y value"+arg.y);
		arg.test();
		arg.x=40;
		arg.y=4.8;
	}
}
class Mainclass1     
{
	public static void main(String[] args)
	{
		Sample1 s1=new Sample1();
		demo1 d1=new demo1();
		s1.display(d1);
		//System.out.println(d1.x);
		//System.out.println(d1.y);
	}
}