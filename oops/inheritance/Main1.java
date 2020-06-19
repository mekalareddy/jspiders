class SI1
{
	int x =10;
	void test()
	{
		System.out.println("running test()....");
	}
}
class SI2 extends SI1
{
	double y=1.6;
	void disp()
	{
		System.out.println("running disp()...");
	}
}
class Main1
{
	public static void main(String[] args)
	{
		SI2 d1=new SI2();
		System.out.println(d1.x);
		System.out.println(d1.y);
		d1.test();
		d1.disp();
	}
}