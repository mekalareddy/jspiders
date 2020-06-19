class HY1
{
	int x =10;
	void test()
	{
		System.out.println("running test()....");
	}
}
class HY2 extends HY1
{
	double y=1.6;
	void disp()
	{
		System.out.println("running disp()...");
	}
}
class HY3 extends HY2
{
	char z='G';
	void disk()
	{
		System.out.println("running disk()...");
	}
}
class HY4 extends HY1
{
	float a=12;
	void disc()
	{
		System.out.println("running disc()...");
	}
}
class Main3
{
	public static void main(String[] args)
	{
		HY3 d1=new HY3();
		HY4 d2=new HY4();
		System.out.println(d1.x);
		System.out.println(d1.y);
		System.out.println(d1.z);
		System.out.println(d2.x);
		System.out.println(d2.a);
		d1.test();
		d1.disp();
		d1.disk();
		d2.test();
		d2.disc();
	}
}