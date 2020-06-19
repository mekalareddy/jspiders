class HI1
{
	int x =10;
	void test()
	{
		System.out.println("running test()....");
	}
}
class HI2 extends HI1
{
	double y=1.6;
	void disp()
	{
		System.out.println("running disp()...");
	}
}
class HI3 extends HI1
{
	char z='G';
	void disc()
	{
		System.out.println("running disc()...");
	}
}
class Main4
{
	public static void main(String[] args)
	{
		HI2 d1=new HI2();
		HI3 d2=new HI3();
		System.out.println(d1.x);
		System.out.println(d1.y);
		System.out.println(d2.x);
		System.out.println(d2.z);
		d1.test();
		d1.disp();
		d2.test();
		d2.disc();
	}
}