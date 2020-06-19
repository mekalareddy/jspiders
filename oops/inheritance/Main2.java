class MI1
{
	int x =10;
	void test()
	{
		System.out.println("running test()....");
	}
}
class MI2 extends MI1
{
	double y=1.6;
	void disp()
	{
		System.out.println("running disp()...");
	}
}
class MI3 extends MI2
{
	char z='G';
	void disc()
	{
		System.out.println("running disc()...");
	}
}
class Main2
{
	public static void main(String[] args)
	{
		MI3 d1=new MI3();
		System.out.println(d1.x);
		System.out.println(d1.y);
		System.out.println(d1.z);
		d1.test();
		d1.disp();
		d1.disc();
	}
}