class sample1
{
	void useinterface(Demo5 arg1)
	{
		System.out.println(arg1.x);
		arg1.test();
		if(arg1 instanceof Demo6)
		{
			Demo6 d1=(Demo6)arg1;
			System.out.println(d1.y);
			d1.disp();	
		}
		else if(arg1 instanceof Demo7)
		{
			Demo7.d2=(Demo7)arg1;
			System.out.println(d2.z);
			d2.view();
		}	  
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
class FFF
{
	public static void main(String[] args)
	{
		sample1 s1=new sample1();
		//s1.useinterface(new Demo5());
		//s1.useinterface(new Demo6());
		s1.useinterface(new Demo7());
	}
}