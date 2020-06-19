class Demo1
{
	int x=10;
	void test()
	{
		System.out.println("running test(),,,,");
	}
}
class Demo2 extends Demo1
{
	double y=1.0;
	void disp()
	{
		System.out.println("running disp(),,,,");
	}
}
class Demo3 extends Demo1
{
	double y=1.0;
	void view()
	{
		System.out.println("running view(),,,,");
	}
}
class DDD
{
	public static void main(String[] args)
	{
		Demo2 d1=new Demo2();
		System.out.println(d1.x);
		d1.test();
		System.out.println(d1.y);
		d1.disp();
		Demo1 d2=d1;
		System.out.println(d2.x);
		d2.test();
		Demo2 d1=new Demo3();
		Demo2 d4=(Demo2)new Demo1();

	}
}