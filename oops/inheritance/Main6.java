class ST1
{
	static int x =10;
	void test()
	{
		System.out.println("running test()....");
	}
}
class ST2 extends ST1
{
	double y=1.6;
	void disp()
	{
		System.out.println("running disp()...");
	}
}
class Main6
{
	public static void main(String[] args)
	{
		ST2 d1=new ST2();
		System.out.println(d1.x);
		System.out.println(d1.y);
		d1.test();
		d1.disp();
	}
}