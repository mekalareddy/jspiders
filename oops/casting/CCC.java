class Demo1
{
	int x=10;
	void test()
	{
		System.out.println("running test(),,,,");
	}
}
class Demo2
{
	double y=1.0;
	void disp()
	{
		System.out.println("running disp(),,,,");
	}
}
class CCC
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
	}
}