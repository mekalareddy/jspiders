interface Demo4
{
	void test();
}
interface Demo5
{
	void disp();
}
class Sample3 implements Demo4,Demo5
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
class Main2
{
	public static void main(String[] args)
	{
		Sample3 s1=new Sample3();
		s1.test();
		s1.disp();
	}
}

