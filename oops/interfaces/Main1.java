interface Demo2
{
	void test();
}
interface Demo3 extends Demo2
{
	void disp();
}
class Sample implements Demo3
{
	public void test()
	{
		System.out.println("test() implements in sample class"); 
	}
	public void disp()
	{
		System.out.println("disp() implements in sample class"); 
	}
}
class Main1
{
	public static void main(String[] args)
	{
		Sample s1=new Sample();
		s1.test();
		s1.disp();
	}
}

