interface Demo1
{
	abstract void test();
	abstract void disp();
}
class Sample1 implements Demo1
{
	public void test()
	{
		System.out.println("test() implements in sample1");
	}
	public void disp()
	{
		System.out.println("disp() implements in sample1");
	}
}
class Main
{
	public static void main(String[] args)
	{	
		Sample1 s1=new Sample1();
		s1.test();
		s1.disp();
	}
}