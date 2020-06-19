class demo2
{
	int x=10;
	double y=4.5;
	void test()
	{
		System.out.println("running test().....");
	}
}
class Sample2
{
	demo2 display()
	{
		demo2 d1=new demo2();
		return d1;
	}
}
class Mainclass2 
{
	public static void main(String[] args)
	{
		Sample2 s1=new Sample2();
		demo2 obj1=s1.display();
		System.out.println(obj1.x);
		System.out.println(obj1.y);
		obj1.test();
	}
}