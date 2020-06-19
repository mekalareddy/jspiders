class sample1
{
	void useinterface(Demo5 arg1)
	{
		System.out.println(arg1.x);
		arg1.test();
	}
}
class Demo5
{
	int x=1;
	void test()
	{
		System.out.println("running test(),,,,");
	}
}
class Demo6 extends Demo5
{
	double y=1.0;
	void disp()
	{
		System.out.println("running disp(),,,,");
	}
}
class Demo7 extends Demo6
{
	char z='k';
	void view()
	{
		System.out.println("running view(),,,,");
	}
}
class EEE
{
	public static void main(String[] args)
	{
		sample1 d1=new sample1();
		d1.useinterface(new Demo5());
		d1.useinterface(new Demo6());
		d1.useinterface(new Demo7());
	}
}