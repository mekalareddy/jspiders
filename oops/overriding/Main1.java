class Demo1
{
	void test()
	{
		System.out.println("running test() in demo1");
	}
}
class Demo2 extends Demo1
{
	void test()
	{
		System.out.println("running test() overridded in demo2");
	}
	void test(int arg1)
	{
		System.out.println("running test() overridded in demo2");
		System.out.println("value of arg is"+arg1);
	}
}
class Demo3 extends Demo2
{
	void test()
	{
		super.test();
		System.out.println("running test() overrided  in demo3");
	}
}

class Main1
{
	public static void main(String[] args)
	{
		Demo3 d1=new Demo3();
		d1.test();
		d1.test(12);
	}
}