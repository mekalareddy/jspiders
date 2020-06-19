final class FY1
{
	int x =10;
	void test()
	{
		System.out.println("running test()....");
	}
}
class FY2 extends FY1
{
	double y=1.6;
	void disp()
	{
		System.out.println("running disp()...");
	}
}
class Main5
{
	public static void main(String[] args)
	{
		FY2 d1=new FY2();
		System.out.println(d1.x);
		System.out.println(d1.y);
		d1.test();
		d1.disp();
	}
}